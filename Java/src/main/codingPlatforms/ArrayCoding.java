package main.codingPlatforms;

import java.util.*;
import static org.junit.Assert.assertEquals;

public class ArrayCoding {

    public static void main(String[] args) {
        assertEquals(solution(new int[]{1, 1, 2}), 2);
        assertEquals(solution2(new int[]{1, 1, 1, 2, 2, 3}), 5);

        printMissingNumber(new int[]{1, 2, 3, 4, 6}); // 1
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}); // 1
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}); // 2
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}); // 3

        printDuplicateNumber(new int[]{1, 1, 2, 2, 3, 4, 5}); // [1, 0, 2, 0, 3, 4, 5]
        printDuplicateNumber(new int[]{1, 1, 1, 1, 1, 1, 1}); // [1, 0, 0, 0, 0, 0, 0]
        printDuplicateNumber(new int[]{1, 2, 3, 4, 5, 6, 7}); // [1, 2, 3, 4, 5, 6, 7]
        printDuplicateNumber(new int[]{1, 2, 1, 1, 1, 1, 1}); // [1, 0, 0, 0, 0, 0, 2]

        minMaxNumber(new int[]{1, 2, 1, 1, 1, 1, 1}); // [1, 2]
        minMaxNumber(new int[]{1, 2, 3, 4, 5, 6, 7}); // [1, 7]

        sumPairs(new int[]{1, 1, 3, 3, 4, 2, 6, 7}, 6); // [[2, 4], [3,3]]
    }

    /**
     * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
     * length. Do not allocate extra space for another array, you must do this in place with constant memory.
     * For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
     *
     * @param A
     * @return
     *
     */
    public static int solution(int[] A) {
        if (A.length < 2) {
            return A.length;
        }

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }

            i++;
        }

        return j + 1;
    }

    /**
     * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
     * For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5, and A is now [1,1,
     * 2,2,3].
     * So this problem also requires in-place array manipulation.
     *
     * @param A
     * @return
     *
     */
    public static int solution2(int[] A) {
        if (A == null) {
            return 0;
        }
        if (A.length < 3) {
            return A.length;
        }

        int i = 1;
        int j = 2;

        while (j < A.length) {
            if (A[j] != A[i] || A[j] != A[i - 1]) {
                i++;
                A[i] = A[j];
            }
            j++;
        }

        return i + 1;
    }

    // How do you find the missing number in a given integer array of 1 to 100?
    public static int printMissingNumber(int[] arr) {
        int maxValue = java.util.Arrays.stream(arr).max().getAsInt();

        System.out.println(maxValue - arr.length);
        return maxValue - arr.length;
    }

    // How do you find the duplicate number on a given integer array?
    // How are duplicates removed from a given array in Java?
    // How do you remove duplicates from an array in place?
    // How are duplicates removed from an array without using any library?
    public static int[] printDuplicateNumber(int[] arr) {
        java.util.Arrays.sort(arr);

        int[] dupArr = new int[arr.length];
        dupArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                dupArr[i] = arr[i];
            }
        }

        System.out.println(java.util.Arrays.toString(dupArr));
        return dupArr;
    }

    // How do you find the largest and smallest number in an unsorted integer array?
    public static int[] minMaxNumber(int[] arr) {
        IntSummaryStatistics stats = java.util.Arrays.stream(arr).summaryStatistics();
        System.out.println(stats);
        int minVal = stats.getMin();
        int maxVal = stats.getMax();

        System.out.println("[" + minVal + "," + maxVal + "]");
        return new int[]{minVal, maxVal};
    }

    // How do you find all pairs of an integer array whose sum is equal to a given number?
    public static void sumPairs(int[] arr, int sum) {
        if(arr.length < 2){
            return;
        }
        Set<Integer> mySet = new HashSet<>();

        for(int value : arr) {
            int target = sum - value;
            if(!mySet.contains(target)) {
                mySet.add(value);
            } else {
                System.out.println(value + " " + target);
            }
        }

         System.out.println(mySet);
    }

    // How do you find duplicate numbers in an array if it contains multiple duplicates?


    // How is an integer array sorted in place using the quicksort algorithm?


    // How do you reverse an array in place in Java?
}

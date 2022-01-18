package main.interviews;

import static org.junit.Assert.assertEquals;

public class InterviewFour {

    public static void main(String[] args) {

        assertEquals(problem1(new int[]{1, 1000, 80, -91}), -11);
        assertEquals(problem2(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2), 24);
        assertEquals(problem2(new int[]{10, 19, 15}, 3, 2), -1);
    }

    /**
     * Pravati is given an array of integers. She is asked to return the sum of all the two digit numbers in the
     * array. Please help her to perform this task.
     * <p>
     * Write a function:
     * class Solution { public int solution(int[] A); }
     * that, given an array A consisting of N integers, return the sum of all two-digit numbers.
     * <p>
     * For example, given A = [1, 1000, 80, -91], the function show return -11 (as the two-digits numbers are 80 and
     * -91).
     * <p>
     * Given A = [47, 1900, 1, 90, 45], the function should return 182 (as the two-digit numbers are 47, 90, and 45)
     * <p>
     * Given A = [-13, 1900, 1, 100, 45], the function should return 32 (as the two-digit numbers are -13, and 45)
     * <p>
     * Assume that:
     * * N is an integer within the range [0...100,000];
     * * Each element of array A is an integer within the range [-2,147,483,648...2,147,483,647]
     * <p>
     * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
     */
    private static int problem1(int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (Integer.toString(Math.abs(A[i])).length() == 2) {
                counter += A[i];
            }
        }

        return counter;
    }

    /**
     * Alice and Bob work in a beautiful orchard. There are N apple trees in the orchard. The apple trees are
     * arranged in a row and they are numbered from 1 to N.
     * <p>
     * Alice is planning to collect all the apples from K consecutive trees and Bob is planning to collect all the
     * apples from L consecutive trees. They want to choose two disjoint segments (one consisting of K trees for
     * Alice and the other consisting of L trees for Bob) so as not to disturb each other. What is the maximum number
     * of apples that they can collect?
     * <p>
     * Write a function that given an array A consisting of N integers denating the number of apples on each apple
     * tree in the row, and integers K and L denoting, respectively, the number of trees that Alice and Bob can
     * choose when collecting, returns the maximum number of apples that can be collected by them, or -1 if there are
     * no such intervals.
     * <p>
     * For example, given A =[6, 1,4,6,3,2,7,4], K=3, L=2, your function should return 24, because Alice can choose
     * trees 3 to 5 and collect 4 + 6 + 3 = 13 apples, and Bob can choose trees 7 to 8 and collect 7 + 4 = 11 apples.
     * Thus, they will collect 13 + 11 = 24 apples in total, and that is the maximum number that can be achieved.
     * <p>
     * Given A = [10, 19, 15], K = 2, L = 2, your function should return -1, because it is not possible for Alice and
     * Bob to choose two disjoint intervals.
     * <p>
     * Assume that:
     * * N is an integer within the range [2..600];
     * * K and L are integers within the range [1 .. N-1];
     * * Each element of array A is an integer within the range [1..500]
     */
    private static int problem2(int[] A, int K, int L) {

        int treeCollection1 = findMaximumTreesCollected(A, A.length, K, L);
        int treeCollection2 = findMaximumTreesCollected(A, A.length, K, L);

        return Math.max(treeCollection1, treeCollection2);
    }

    private static int findMaximumTreesCollected(int[] A, int totalTrees, int K, int L) {
        if ((K + L) > totalTrees) {
            return -1;
        }

        int[] sum = new int[totalTrees];
        int maxApples = -1;
        int kApples = 0;
        int lApples = 0;

        for (int i = 1; i < totalTrees; i++) {
            sum[i] = (i == 0 ? A[0] : sum[i - 1] + A[i]);
        }

        for (int i = 0; i < totalTrees - (K - 1); ++i) {
            kApples = (i > 0 ? sum[i + K - 1] - sum[i - 1] : sum[i + K - 1]);

            for (int j = i + K; j < totalTrees - (L - 1); ++j) {
                lApples = (j > 0 ? sum[j + L - 1] - sum[j - 1] : sum[j + L - 1]);

                maxApples = Math.max(maxApples, kApples + lApples);
            }
        }

        return maxApples;
    }
}

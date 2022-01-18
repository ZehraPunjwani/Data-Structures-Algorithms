package main.codingPlatforms.codility.challenges;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Alpha2010 {

    public static void main(String[] args) {
        // Lesson 1 Iterations
        assertEquals(solution1(new int[]{2, 2, 1, 0, 1}), 3);
        assertEquals(solution2(new int[]{2, 2, 1, 0, 1}), 3);
    }

    // Task Score - 100%
    // Correctness - 100%
    // Performance - 100%
    public static int solution1(int[] A) {
        Map<Integer, Integer> setTrue = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            if (!setTrue.containsKey(A[i])) {
                setTrue.put(A[i], i);
            }
        }
        return Collections.max(setTrue.values());
    }

    // Task Score - 64%
    // Correctness - 100%
    // Performance - 43%
    public static int solution2(int[] A) {
        // write your code in Java SE 8
        List<Integer> arrayA = new ArrayList<>();
        for(int i : A) arrayA.add(i);

        List<Boolean> myArray = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            myArray.add(arrayA.subList(0, i).contains(A[i]));
        }
        return myArray.lastIndexOf(false);
    }
}

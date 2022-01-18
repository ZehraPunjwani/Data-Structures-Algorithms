package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CyclicRotations {
    public static void main(String[] args) {
        // Lesson 2 Arrays
        assertEquals(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4)), Arrays.toString(new int[]{1, 2, 3,
                4}));
    }

    public static int[] solution(int[] A, int K) {
        int[] rotatedAKTimes = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int indexPlusK = (i + K) % A.length;
            rotatedAKTimes[indexPlusK] = A[i];
        }
        return rotatedAKTimes;
    }
}

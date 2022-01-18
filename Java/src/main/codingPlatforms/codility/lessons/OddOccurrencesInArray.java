package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        // Lesson 3 Complexity
        assertEquals(solution(new int[]{9, 3, 9, 3, 9, 7, 9}), 7);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; ) {
            if (i != A.length - 1) {
                if (A[i] == A[i + 1]) {
                    i += 2;
                } else {
                    return A[i];
                }
            } else {
                return A[A.length - 1];
            }
        }

        return A[0];
    }
}

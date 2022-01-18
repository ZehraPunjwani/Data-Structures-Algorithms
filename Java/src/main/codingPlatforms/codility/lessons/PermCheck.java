package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PermCheck {

    public static void main(String[] args) {
        // Lesson 4 Counting Elements
        assertEquals(solution(new int[]{4, 1, 3, 2}), 1);
        assertEquals(solution(new int[]{4, 1, 3}), 0);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }

        return 1;
    }
}

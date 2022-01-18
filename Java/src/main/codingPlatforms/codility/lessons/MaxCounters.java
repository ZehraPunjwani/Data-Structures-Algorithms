package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxCounters {

    public static void main(String[] args) {
        // Lesson 4 Counting Elements
        assertEquals(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})), Arrays.toString(new int[]{3, 2,
                2, 4, 2}));
    }

    public static int[] solution(int N, int[] A) {
        int max = 0;
        int min = 0;
        int[] counters = new int[N];

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (counters[A[i] - 1] < min) {
                    counters[A[i] - 1] = min;
                }

                counters[A[i] - 1]++;

                if (counters[A[i] - 1] > max) {
                    max = counters[A[i] - 1];
                }
            } else if (A[i] == N + 1) {
                min = max;
            }
        }

        for (int j = 0; j < counters.length; j++) {
            if (counters[j] < min) {
                counters[j] = min;
            }
        }

        return counters;
    }
}

package main.codingPlatforms.codility.lessons;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSlice {

    public static void main(String[] args) {
        // Lesson 1 Iterations
        assertEquals(solution(new int[]{4, 2, 2, 5, 1, 5, 8}), 1);
    }

    /*

     */
    public static int solution(int[] A) {
        double prevAverage = ((double)A[0] + A[1]) / 2;
        int prevIndex = 0;
        double minAverage = prevAverage;
        int result = prevIndex;

        for (int i = 2; i < A.length; i++) {
            double currAverage = (prevAverage * (i - prevIndex) + A[i]) / (i - prevIndex + 1);
            if (A[i] + A[i-1] >= currAverage * 2) {
                prevAverage = currAverage;
            } else {
                prevAverage = ((double)A[i] + A[i-1]) / 2;
                prevIndex = i - 1;
            }
            if (prevAverage < minAverage) {
                minAverage = prevAverage;
                result = prevIndex;
            }
        }

        return result;
    }
}

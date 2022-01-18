package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MissingInteger {

    public static void main(String[] args) {
        // Lesson 4 Counting Elements
        assertEquals(solution(new int[]{1, 2, 3}), 4);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int smallestPos = 1;
        for (int i : A) {
            if (i == smallestPos) {
                smallestPos++;
            }
        }

        return smallestPos;
    }
}

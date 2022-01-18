package main.codingPlatforms.codility.lessons;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FrogRiverOne {

    public static void main(String[] args) {
        // Lesson 4 Counting Elements
        assertEquals(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}), 6);
    }

    public static int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                leaves.add(A[i]);
                if (leaves.size() == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}

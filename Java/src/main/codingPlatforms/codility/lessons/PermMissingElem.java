package main.codingPlatforms.codility.lessons;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PermMissingElem {

    public static void main(String[] args) {
        // Lesson 3 Complexity
        assertEquals(solution(new int[]{2, 3, 1, 5}), 4);
    }

    public static int solution(int[] A) {
        int previous = 0;
        if (A.length != 0) {
            Arrays.sort(A);
            for (int i : A) {
                if (++previous != i) {
                    return previous;
                }
            }
        }
        return ++previous;
    }
}

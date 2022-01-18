package main.codingPlatforms.codility.lessons;

import static org.junit.Assert.assertEquals;

public class FrogJmp {

    public static void main(String[] args) {
        // Lesson 3 Complexity
        assertEquals(solution(10, 85, 39), 2);
    }

    public static int solution(int X, int Y, int D) {
        int remainder = (Y - X) / D;
        return (Y - X) % D == 0 ? remainder : remainder + 1;
    }
}

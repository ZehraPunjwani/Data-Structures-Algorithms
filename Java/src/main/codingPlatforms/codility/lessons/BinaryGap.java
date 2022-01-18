package main.codingPlatforms.codility.lessons;

import static org.junit.Assert.assertEquals;

public class BinaryGap {

    public static void main(String[] args) {
        // Lesson 1 Iterations
        assertEquals(solution(529), 4);
    }

    public static int solution(int N) {
        String binaryNStr = Integer.toBinaryString(N);
        String[] binaryNArr = binaryNStr.replaceAll("0+$", "").split("1");

        int counter = 0;
        for (String binary : binaryNArr) {
            if (binary.length() > 0 && binary.length() > counter) {
                counter = binary.length();
            }
        }
        return counter;
    }
}

package main.codingPlatforms.codility.lessons;

import static org.junit.Assert.assertEquals;

public class CountDiv {

    public static void main(String[] args) {
        // Lesson 1 Iterations
        assertEquals(solution(6, 11, 2), 3);
        assertEquals(solution(5, 11, 2), 3);
        assertEquals(solution(6, 11, 2), 3);
        assertEquals(solution(0, 11, 5), 3);
        assertEquals(solution(0, 11, 12), 1); //K>B, A==0
        assertEquals(solution(1, 11, 12), 0); //K>B, A>0
        assertEquals(solution(0, 0, 12), 1); //K>B, A==0, B==0
        assertEquals(solution(11, 33, 3), 8);
        assertEquals(solution(10, 10, 5), 1); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution(10, 10, 7), 0); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution(10, 10, 20), 0); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution(33, 33, 33), 1); //A == B
        assertEquals(solution(100000, 1000000, 1000), 901);
        assertEquals(solution(1000, 10000, 10), 901);
        assertEquals(solution(100, 1000, 1), 901);
        assertEquals(solution(0, 2000000000, 2000000000), 2); //max B
        assertEquals(solution(2000000000, 2000000000, 2000000000), 1); //max A, B
        assertEquals(solution(100, 123000000, 2), 61499951); //A = 100, B=123M+, K=2
        assertEquals(solution(101, 123000000, 10000), 12300); //A = 101, B = 123M+, K = 10K

        assertEquals(solution2(6, 11, 2), 3);
        assertEquals(solution2(5, 11, 2), 3);
        assertEquals(solution2(6, 11, 2), 3);
        assertEquals(solution2(0, 11, 5), 3);
        assertEquals(solution2(0, 11, 12), 1); //K>B, A==0
        assertEquals(solution2(1, 11, 12), 0); //K>B, A>0
        assertEquals(solution2(0, 0, 12), 1); //K>B, A==0, B==0
        assertEquals(solution2(11, 33, 3), 8);
        assertEquals(solution2(10, 10, 5), 1); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution2(10, 10, 7), 0); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution2(10, 10, 20), 0); //A = 10, B = 10, K in {5,7,20}
        assertEquals(solution2(33, 33, 33), 1); //A == B
        assertEquals(solution2(100000, 1000000, 1000), 901);
        assertEquals(solution2(1000, 10000, 10), 901);
        assertEquals(solution2(100, 1000, 1), 901);
        assertEquals(solution2(0, 2000000000, 2000000000), 2); //max B
        assertEquals(solution2(2000000000, 2000000000, 2000000000), 1); //max A, B
        assertEquals(solution2(100, 123000000, 2), 61499951); //A = 100, B=123M+, K=2
        assertEquals(solution2(101, 123000000, 10000), 12300); //A = 101, B = 123M+, K = 10K
    }

    // Task Score 50%
    // Correctness 100%
    // Performance 0%
    public static int solution(int A, int B, int K) {
        int counter = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                counter++;
            }
        }
        return counter;
    }

    // Task Score 100%
    // Correctness 100%
    // Performance 100%
    public static int solution2(int A, int B, int K) {
        if (A == 0) {
            return B / K - (-1);
        }
        return B / K - ((A - 1) / K);
    }
}

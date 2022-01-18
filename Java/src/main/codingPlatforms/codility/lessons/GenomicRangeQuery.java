package main.codingPlatforms.codility.lessons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        // Lesson 1 Iterations
        assertEquals(Arrays.toString(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})), Arrays.toString(new int[]{2, 4, 1}));
    }

    //    Task Score 100%
    //    Correctness 100%
    //    Performance 100%
    public static int[] solution(String S, int[] P, int[] Q) {
        Map<Character, int[]> NucleotideTypesToImpactFactor = new HashMap<>();
        char[] letters = { 'A', 'C', 'G', 'T' };
        for (char letter : letters) {
            int[] counts = new int[S.length()];
            for (int i = 0; i < counts.length; i++) {
                counts[i] = (i == 0 ? 0 : counts[i - 1]) + (S.charAt(i) == letter ? 1 : 0);
            }
            NucleotideTypesToImpactFactor.put(letter, counts);
        }

//        for (Map.Entry<Character, int[]> entry : NucleotideTypesToImpactFactor.entrySet()) {
//            Character key = entry.getKey();
//            int[] value = entry.getValue();
//            System.out.println(key + " "  + Arrays.toString(value));
//        }

        int[] minImpacts = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                int[] letter = NucleotideTypesToImpactFactor.get(letters[j]);
                int value = letter[Q[i]] - (P[i] == 0 ? 0 : letter[P[i] - 1]);
                if (value > 0) {
                    minImpacts[i] = j + 1;
                    break;
                }
            }
        }

        return minImpacts;
    }
}

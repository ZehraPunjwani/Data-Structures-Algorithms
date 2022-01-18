package main.codingPlatforms.codility.challenges;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashSet;
import java.util.stream.Collectors;

// ConcatenatingOfWords
public class Strontium2019 {

    public static void main(String[] args) {
        // Lesson 1 Iterations

        // Hello -> [ehlol, lleho, llohe, lohel, loleh, lehol, leloh, lhelo, lhole, oelhl, hleol, holle, oehll, oellh, llhoe, loelh, lolhe, ohlle, ollhe, lheol, elhlo, olhle, ehllo, ellho, leolh, llheo, lhleo, hello, leohl, eohll, eollh, hloel, holel, helol, eolhl, hlelo, hlole, hlloe, hoell, ohlel, lleoh, lohle, olhel, olleh, ohell, olehl, loehl, lhloe, elolh, olelh, eholl, elohl, lehlo, lloeh, lhoel, heoll, lelho, elloh, hlleo, elhol]
//        assertNull(stringSolution("hello"));

        // ["aabb", "aaaa", "bbab"] -> 6
        assertEquals(arraySolution(new String[]{"cod", "ili", "ity"}), null);

        // ["xxbxx", "xbx", "x"] -> 4


        // ["dd", "bb", "cc", "dd"] -> 4
    }

    public static void stringPermutation(String str, String prefix, Set<String> uniquePermutations) {
        if(str.length() == 0) {
            uniquePermutations.add(prefix);
        } else {
            for(int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                stringPermutation(rem, prefix + str.charAt(i), uniquePermutations);
            }
        }
    }

    public static Object stringSolution(String str) {
        Set<String> uniquePermutations = new HashSet<>();
        stringPermutation(str, "", uniquePermutations);

        System.out.println(uniquePermutations);
        System.out.println(uniquePermutations.size());
        return null;
    }

    public static void arrayPermutation(String[] str, String prefix, Set<String> uniquePermutations) {
        if(str.length == 0) {
            uniquePermutations.add(prefix);
        } else {
            for(int i = 0; i < str.length; i++) {
                String rem = str[i].substring(0, i) + str[i].substring(i + 1);
                stringPermutation(rem, prefix + str[i], uniquePermutations);
            }
        }
    }

    public static Object arraySolution(String[] str) {
        Set<String> uniquePermutations = new HashSet<>();
        arrayPermutation(str, "", uniquePermutations);

        System.out.println(uniquePermutations);
        System.out.println(uniquePermutations.size());
        return null;
    }
}

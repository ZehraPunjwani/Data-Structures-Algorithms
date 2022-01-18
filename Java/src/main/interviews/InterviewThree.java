package main.interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class InterviewThree {

    public static void main(String[] args) {

        assertEquals(solution(3, new String[]{"co", "dil", "ity"}, ""), 5);
        assertEquals(solution(3, new String[]{"aabb", "aaaa", "bbab"}, ""), 6); // aaaaaabbbbab
        assertEquals(solution(3, new String[]{"xxbxx", "xbx", "x"}, ""), 4); // xxbxxxxbx
        assertEquals(solution(3, new String[]{"dd", "bb", "cc", "dd"}, ""), 4); // ddddbbcc
    }

    /**
     * An array of N words is given. Each word consists of small letters ('a' − 'z'). Our goal is to concatenate the
     * words in such a way as to obtain a single word with the longest possible substring composed of one particular
     * letter. Find the length of such a substring.
     * <p>
     * Write a function:
     * <p>
     * class Solution { public int solution(String[] words); }
     * <p>
     * that, given an array words containing N strings, returns the length of the longest substring of a word created
     * as described above.
     * <p>
     * Examples:
     * <p>
     * 1. Given N=3 and words=["aabb", "aaaa", "bbab"], your function should return 6. One of the best concatenations
     * is words[1] + words[0] + words[2] = "aaaaaabbbbab". The longest substring is composed of letter 'a' and its
     * length is 6.
     * <p>
     * 2. Given N=3 and words=["xxbxx", "xbx", "x"], your function should return 4. One of the best concatenations is
     * words[0] + words[2] + words[1] = "xxbxxxxbx". The longest substring is composed of letter 'x' and its length
     * is 4.
     * <p>
     * 3. Given N=4 and words=["dd", "bb", "cc", "dd"], your function should return 4. One of the best concatenations
     * is words[0] + words[3] + words[1] + words[2] = "ddddbbcc". The longest substring is composed of letter 'd' and
     * its length is 4.
     * <p>
     * Write an efficient algorithm for the following assumptions:
     * <p>
     * N is an integer within the range [1..100,000];
     * all the words are non−empty and consist only of lowercase letters (a−z);
     * S denotes the sum of the lengths of words; S is an integer within the range [1..100,000].
     */
    private static int solution(int n, String[] A, String currentWord) {
        List<String> AList = Arrays.asList(A);
        Set<String> mySet = new HashSet<>();
        if (n == 0) {
            if (!mySet.contains(currentWord) && !AList.contains(currentWord)) {
                mySet.add(currentWord);
            }
        } else {
            for (int i = 0; i < A.length; i++) {
                if (currentWord.equals(A[i])) {
                    solution(n - 1, A, "" + A[i]);
                } else {
                    solution(n - 1, A, currentWord + A[i]);
                }
            }
        }

        return (int) Arrays.stream(mySet.toArray()).count();
    }
}

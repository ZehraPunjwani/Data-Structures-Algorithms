package main.interviews;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class InterviewFive {

    public static void main(String[] args) {

        assertEquals(problem1(new String[]{"cod", "ili", "ity"}), 1);
    }

    /**
     * @param A
     * @return
     */
    public static int problem1(String[] A) {
        // write your code in Java SE 8
        Set<String> mySet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                String myWord = A[i].concat(A[j]);
                if (A[i] != A[j] && !mySet.contains(myWord) && !hasDup(myWord)) {
                    mySet.add(myWord);
                }
            }
        }

        return mySet.size();
    }

    public static boolean hasDup(String myWord) {
        Set<Character> set = new HashSet<>();

        for (Character c : myWord.toCharArray()) {
            if (set.contains(c)) {
                return true;
            } else {
                set.add(c);
            }
        }

        return false;
    }
}

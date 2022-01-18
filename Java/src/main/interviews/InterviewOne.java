package main.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class InterviewOne {

    public static void main(String[] args) {
        assertEquals(herminonsCheetSheet("ABABCABABCD"), "AB*C*D");

        assertEquals(returnEncodedStringWithRepeatedCharactersAndOccurance("aaabbccc"), "a3b2c3");

        assertEquals(isPowerOfTen(1000), true);
        assertEquals(isPowerOfTen(4), false);
        assertEquals(isPowerOfTen(0), false);
        assertEquals(isPowerOfTen(10), true);
        assertEquals(isPowerOfTen(100), true);

        assertEquals(FirstNonDuplicateCharacter("apple"), "a");
        assertEquals(FirstNonDuplicateCharacter("racecar"), "e");

        assertEquals(StudentPresidentElection(4, 2), "1");

        assertEquals(LongestContinuousSubsequence("abbbcc"), "b3");
    }

    /*
        Question:
            Hermione is preparing a cheat-sheet for her final exam in Potions class.
            To create a potion, one must combine ingredients in a specific order, any of which may be repeated.

            As an example, consider the following potion which uses 4 distinct ingredients
            (A,B,C,D) in 11 steps: A, B, A, B, C, A, B, A, B, C, D

            Hermione realizes she can save tremendous space on her cheat-sheet by introducing a
            special instruction, '*', which means "repeat from the beginning".

            Using these optimizations, Hermione is able to encode the potion above using only 6 characters: A,B,*,C,*,D

            Your job is to write a function that takes as input an un-encoded potion and returns the
            minimum number of characters required to encode the potion on Hermione's Cheat Sheet.
     */
    public static String herminonsCheetSheet(String unencodedPortion) {
        StringBuilder encodedPortion = new StringBuilder();
        encodedPortion.append(unencodedPortion.charAt(0));
        for (int i = 1; i < unencodedPortion.length(); ) {
            if (unencodedPortion.substring(i).startsWith(unencodedPortion.substring(0, i))) {
                encodedPortion.append("*");
                i += i;
            } else {
                encodedPortion.append(unencodedPortion.charAt(i));
                i++;
            }
        }
        return unencodedPortion + ": " + encodedPortion.toString();
    }

    /*
            Coderpad Example:

            cid:d46012bb-7ae3-4929-8de8-1d3096c6aadd

            So you had to create a method that can calculate all the snow in a "mountain ranges" - example above
            shows the answer of 9 for the above example, but as you add more tests you will see different "mountain
            ranges". I'd recommend focussing on getting something working and talking through your solution - once it
             works refactor and improve the performance of it. I think the best way to do this would be using Stacks
             - not many loops. Going to try and find a model answer over the weekend.
    */
    public static void totalSnowInMountainRanges() {

    }

    /*
            A question about adding fractions:
            You have 2 arrays
            Each has a numerator & a denominator
            Add the two fractions together and return in the simplest form e.g. ½ + ½ = 1 or 1/1
    */
    public static void mixedFractionInSmallestForm() {

    }

    /*
            Given a string with subsequences of repeating characters, output an encoding string which contains all
            the repeated characters with the number of times they occur in a row e.g. "aaabbccc" -> "a3b2c3".
    */
    public static String returnEncodedStringWithRepeatedCharactersAndOccurance(String str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String currentCharAsStr = String.valueOf(str.charAt(i));
            if (!hashMap.containsKey(currentCharAsStr)) {
                hashMap.put(currentCharAsStr, 1);
            } else {
                hashMap.put(currentCharAsStr, hashMap.get(currentCharAsStr) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            return entry.getKey() + " " + entry.getValue();
        }
        return null;
    }

    /*
            For an integer, check if it's a powerOf10
    */
    public static boolean isPowerOfTen(int val) {
        return val % 10 == 0 && val != 0;
    }

    /*
            - Return the first non duplicate character of a string - eg 'apple' should return 'a', 'racecar' should
            return e
     */
    public static String FirstNonDuplicateCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i + 1).contains(String.valueOf(str.charAt(i)))) {
                return String.valueOf(str.charAt(i));
            }
        }
        return "";
    }

    /*
            - Implement the put and get methods of a HashMap, with a class called MyHashMap, setting up all the
            internal data structures
    */
    public static void HashMapPut() {

    }

    public static void HashMapGet() {

    }

    /*
         Find the longest continuous subsequence "abbbcc" etc.
    */
    public static String LongestContinuousSubsequence(String str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String currentCharAsStr = String.valueOf(str.charAt(i));
            if (!hashMap.containsKey(currentCharAsStr)) {
                hashMap.put(currentCharAsStr, 1);
            } else {
                hashMap.put(currentCharAsStr, hashMap.get(currentCharAsStr) + 1);
            }
        }
        int maxValueInMap = (Collections.max(hashMap.values()));
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey() + " " + entry.getValue();
            }
        }
        return null;
    }

    /*
            Find the student with the highest average where each student has not necessarily taken the same number of
             tests. For example Simon took 1 test and got 87%, Charles took 2 test and got 100% and 22%, and Alan
             took 1 test and got 37%. Simon has the highest average of 87%. I solved it using 2 HashMaps, one with
             the name and sum of test scores for each student, and one with the name and number of tests taken for
             each student.
    */
    public static void HighestStudentAverage() {

    }

    /*
            **Students' president elections. There are n students sitting in circle. The teacher goes about the
            circle and sings a song. The song length is k.
            When the song ends, the teacher stops and eliminates the student the teacher is currently standing by.
            Then the song starts again and the teacher is going about the circle again and again until just one
            student is left who is the elected president.
            e.g. if there n = 4 and k = 2, then the first to go will be student No 2, then No 4 and then No 3, so No
            1 is left and that is the correct answer.
     */
    public static int StudentPresidentElection(int n, int k) {
        ArrayList<Integer> studentElection = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            studentElection.add(i);
        }
        int counter = 0;
        for (int i = 1; i <= studentElection.size() - 1; i++) {
            counter += k;
            if (studentElection.get(i) == counter) {
                studentElection.remove(i);
            }
        }
        return studentElection.get(0);
    }
}

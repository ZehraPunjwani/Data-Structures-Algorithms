package main.codingPlatforms.crackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ArraysAndStrings {

    public static void main(String[] args) {
        // isUnique(String string)
        System.out.println("------isUnique(String string)------");
        String[] testList1 = {"abcde", "aaaaa", "ababab", "abcxyz"};
        for (String str : testList1) {
            System.out.println(str + " isUnique(str): " + isUnique(str));
        }

        System.out.println();

        // checkPermutation(String str1, String str2)
        System.out.println("------checkPermutation(String str1, String str2)------");
        String[][] testList2 = {{"aa", "aa"}, {"car", "rac"}, {"hello", "bye"}, {"yo", "oy"}, {"zehra", "punjwani"}};
        for (String[] str : testList2) {
            System.out.println(Arrays.deepToString(str) + " checkPermutation(str[0], str[1]): " + checkPermutation(str[0], str[1]));
        }

        System.out.println();

        // URLify(String str)
        System.out.println("------URLify(String str)------");
        String[] testList3 = {"Mr John Smith ", "c a r", "hello", "bye", "zehra punjwani"};
        for (String str : testList3) {
            System.out.println(str + " URLify(str): " + URLify(str));
        }

        System.out.println();

        // OneAway
        System.out.println("------OneAway(String str1, String str2)------");
        assertEquals(OneAway("pale", "ple"), true);
        assertEquals(OneAway("pales", "pale"), true);
        assertEquals(OneAway("pale", "bale"), true);
        assertEquals(OneAway("pale", "bake"), false);
        assertEquals(OneAway("pal", "bake"), false);

        System.out.println();

        // PalindromePermutation
        System.out.println("------PalindromePermutation(String str)------");
        assertEquals(PalindromePermutation("Tact Coa"),  true);
        assertEquals(PalindromePermutation("Tact Co"),  false);

        // StringCompression
        System.out.println("------StringCompression(String str)------");
        assertEquals(StringCompression("aabcccccaaa"), "a2b1c5a3");
        assertEquals(StringCompression("a"), "a");
        assertEquals(StringCompression("aa"), "a2");
        assertEquals(StringCompression("abcde"), "abcde");
    }

    /*
        Implement an algorithm to determine if a string has all unique characters. What is you cannot use additional
        data structures.
    */
    public static boolean isUnique(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            String str = Character.toString(string.charAt(i));
            if (arrayList.contains(str)) {
                return false;
            }
            arrayList.add(str);
        }
        return true;
    }

    /*
        Given two strings, write a method to describe if one is a permutation of the other
     */
    public static boolean checkPermutation(String str1, String str2) {
        String tmp = "";
        for (int i = str1.length() - 1; i > -1; i--) {
            tmp += str1.charAt(i);
        }
        return tmp.equals(str2);
    }

    /*
        URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has
        sufficient space at the end to hold the additional characters,and that you are given the "true" length of the
         string. (Note: If implementing in Java,please use a character array so that you can perform this operation
         in place.)
        EXAMPLE
        Input: "Mr John Smith ", 13
        Output: "Mr%20John%20Smith"
     */
    public static String URLify(String str) {
        return str.trim().replaceAll("\\s+", "%20");
    }

    /*
        Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin­ drome. A
         palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of
         letters. The palindrome does not need to be limited to just dictionary words.
        EXAMPLE
        Input: Tact Coa
        Output: True (permutations: "taco cat", "atco eta", etc.)
     */
    public static boolean PalindromePermutation(String S) {
        String trimmedS = S.toLowerCase().replaceAll(" ", "");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < trimmedS.length(); i++) {
            String currentCharAsStr = String.valueOf(trimmedS.charAt(i));
            frequencyMap.put(currentCharAsStr, frequencyMap.getOrDefault(currentCharAsStr, 0) + 1);
        }

        int oddCount = 0;
        for(Integer i : frequencyMap.values()) {
            if(i % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    /**
     * There are three types of edits that can be performed on strings: insert a character, remove a character, or
     * replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
     * EXAMPLE
     * <p>
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false
     *
     * @param S1, S2
     * @return
     */
    public static boolean OneAway(String S1, String S2) {
        if (S1.length() == S2.length()) {
            return oneEditReplace(S1, S2);
        } else if (S1.length() + 1 == S2.length()) {
            return oneEditInsertDelete(S1, S2);
        } else if (S1.length() - 1 == S2.length()) {
            return oneEditInsertDelete(S2, S1);
        }

        return false;
    }

    public static boolean oneEditReplace(String S1, String S2) {
        boolean foundDifference = false;
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean oneEditInsertDelete(String S1, String S2) {
        for(int i = 0, j = 0; i < S1.length() && j < S2.length();) {
            if (S1.charAt(i) != S2.charAt(j)) {
                if (i != j) {
                    return false;
                }
            } else {
                i++;
            }
            j++;
        }
        return true;
    }

    /*
        String Compression: Implement a method to perform basic string compression using the counts of repeated
        characters. For example, the string aabcccccaaa      would become a2blc5a3. If the "compressed" string would
        not become smaller than the original string, your method should return
        the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */
    public static String StringCompression(String S) {
        if(S.length() <= 1) {
            return S;
        }

        StringBuilder finalStr = new StringBuilder();
        for(int i = 0, counterFrequency = 0, totalChanges = 0; i < S.length(); i++) {
            ++counterFrequency;
            if(i == S.length() - 1 || S.charAt(i) != S.charAt(i + 1)) {
                finalStr.append(String.valueOf(S.charAt(i)) + (totalChanges > 0 ? counterFrequency : ""));
                counterFrequency = 0;
            } else {
                totalChanges++;
            }
        }

        return String.valueOf(finalStr);
    }

    /*
        Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a
         method to rotate the image by 90 degrees. Can you do this in place?
     */
    public static void RotateMatrix() {

    }

    /*
        Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are
        set to 0.
     */
    public static void ZeroMatrix() {

    }

    /*
        String Rotation:Assume you have a method isSubstring which checks if one word is a substring of another.
        Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to
        isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
     */
    public static void StringRotation() {

    }
}

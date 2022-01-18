package main.codingPlatforms.leetcode;

import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {

    }

    /**
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     *
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     *
     * Input: s = "rat", t = "car"
     * Output: false
     *
     *
     * Constraints:
     *
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     *
     *
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     *
     * @param s
     * @param t
     * @return
     */
    // Approach 1: Sorting
    public boolean isAnagramSorting(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    // Approach 2: Hash Table – Check if the two strings have identical character counts.
    public boolean isAnagramHashTable(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i: count){
            if(i != 0) {
                return false;
            }
        }

        return true;
    }
}

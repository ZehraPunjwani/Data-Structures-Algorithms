package main.codingPlatforms;

import java.util.*;
import java.util.stream.Collectors;

public class StringCoding {

    public static void main(String[] args) {
        System.out.println("isAnagramSubStringApproach 1: " + isAnagramSubStringApproach("Fried", "Fired")); // True
        System.out.println("isAnagramSubStringApproach 2: " + isAnagramSortArrayApproach("Fried", "Fired")); // True
        System.out.println("isAnagramSubStringApproach 3: " + isAnagramStringBuilderApproach("Fried", "Fired")); // True

        System.out.println();

        System.out.println("isPalindrome 1: " + isPalindrome("Test", "tseT"));
        System.out.println("isPalindrome 2: " + isPalindrome("Test1", "2tseT"));
        System.out.println("isPalindrome 2: " + isPalindrome("Test1", "1tseT"));
    }

    //    How do you print duplicate characters from a string?


    //    How do you check if two strings are anagrams of each other?
    public static boolean isAnagramSubStringApproach(String word, String anagram) {
        if(word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();
        for(char c : chars) {
            int index = anagram.indexOf(c);
            if(index != -1) {
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            } else{
                return false;
            }
        }

        return anagram.isEmpty();
    }

    public static boolean isAnagramSortArrayApproach(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);

        return Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean isAnagramStringBuilderApproach(String first, String second){
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);

        for(char ch : characters){
            int index = sbSecond.indexOf("" + ch);
            if(index != -1){
                sbSecond.deleteCharAt(index);
            }else{
                return false;
            }
        }

        return sbSecond.length()==0 ? true : false;
    }

    //    How do you print the first non-repeated character from a string?


    //    How can a given string be reversed using recursion?


    //    How do you check if a string contains only digits?


    //    How are duplicate characters found in a string?


    //    How do you count a number of vowels and consonants in a given string?


    //    How do you count the occurrence of a given character in a string?


    //    How do you find all permutations of a string?


    //    How do you reverse words in a given sentence without using any library method?


    //    How do you check if two strings are a rotation of each other?


    //    How do you check if a given string is a palindrome?
    public static boolean isPalindrome(String str1, String str2) {
        LinkedList<Integer> myLinkedList = new LinkedList();
        myLinkedList.add(4);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(1);

        System.out.println(myLinkedList);
        myLinkedList.sort(Integer::compareTo);
        myLinkedList.add(3, 6);
        System.out.println(myLinkedList);
        return str1.equals(new StringBuilder(str2).reverse().toString());
    }
}

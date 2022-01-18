/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Review the code provided in the editor below, then complete the solveMeFirst function so that it returns the sum of two integers read from stdin. Take some time to understand this code so you're prepared to write it yourself in future challenges.

Input Format
Code that reads input from stdin is provided for you in the editor. There are  lines of input, and each line contains a single integer.

Output Format
Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
      return a + b;
   }
   
 	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}


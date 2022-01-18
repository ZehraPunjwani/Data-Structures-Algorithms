/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Given an array of  integers, can you find the sum of its elements?

Input Format
The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers representing the array's elements.

Output Format
Print the sum of the array's elements as a single integer.
*/

import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        while(in.hasNext()){
            sum += in.nextInt(); 
        }
        System.out.println(sum);
    }
}
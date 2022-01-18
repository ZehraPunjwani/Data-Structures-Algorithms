/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format
The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

Output Format
Print a single value equal to the sum of the elements in the array.
*/

import java.io.*;
import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long sum = 0;
        while(in.hasNext()){
            sum += in.nextInt();
        }
        
        System.out.println(sum);
    }
}
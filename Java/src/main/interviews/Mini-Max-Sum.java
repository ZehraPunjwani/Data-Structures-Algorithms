/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format
A single line of five space-separated integers.

Constraints
Each integer is in the inclusive range [1, 10^9].

Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini-Max-Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        ArrayList<Long> lst = new ArrayList<Long>();
        lst.add(a);
        lst.add(b);
        lst.add(c);
        lst.add(d);
        lst.add(e);
        Collections.sort(lst);
        long total = a + b + c + d + e;
        long minVal = total - lst.get(0);
        long maxVal = total - lst.get(4);
        System.out.println(maxVal + " " + minVal);
    }
}


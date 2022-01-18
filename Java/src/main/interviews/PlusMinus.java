/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10^4 are acceptable.

Input Format
The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers (a0, a1, a2,..., an-1).

Output Format
You must print the following 3 lines:
A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
*/

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        float lessThanZero = 0;
        float equalToZero = 0;
        float moreThanZero = 0;
        while (in.hasNext()){
            int nextInt = in.nextInt();
            if(nextInt < 0){
                lessThanZero++;
            }
            else if(nextInt == 0){
                equalToZero++;
            }
            else{
                moreThanZero++;
            }
        }
        System.out.println(moreThanZero/a + "\n" + lessThanZero/a + "\n" + equalToZero/a);
    }
}
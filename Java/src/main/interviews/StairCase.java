/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Consider a staircase of size n = 4:
   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size n.

Input Format
A single integer, n, denoting the size of the staircase.

Output Format
Print a staircase of size n using # symbols and spaces.
*/

import java.io.*;
import java.util.*;

public class StairCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((j + i) >= n - 1)
                    System.out.print("#");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
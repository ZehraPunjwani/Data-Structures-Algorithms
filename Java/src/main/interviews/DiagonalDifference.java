/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.

Input Format
The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing  space-separated integers describing the columns.

Output Format
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int diag1 = 0;
        int diag2 = 0;
        int counter1 = 0; 
        int counter2 = n - 1;
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j){
                    diag1 += a[a_i][a_j];
                }
                
                if(a_i == counter1 && a_j == counter2){
                    diag2 += a[a_i][a_j];
                    counter1++;
                    counter2--;
                }
            }
        }
        System.out.println(Math.abs(diag1 - diag2));
    }
}
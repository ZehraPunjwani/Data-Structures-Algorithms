/*
Date: 
31st March 2017

By: 
Zehra Punjwani

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int numOfAppFallenOnHouse = 0;
        int numOfOraFallenOnHouse = 0;
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(apple[apple_i] >= 0 && a + apple[apple_i] >= s &&  a + apple[apple_i] <= t){
                numOfAppFallenOnHouse++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(orange[orange_i] <= 0  && b + orange[orange_i] <= t && b + orange[orange_i] >= s){
                numOfOraFallenOnHouse++;
            }
        }
        
        System.out.println(numOfAppFallenOnHouse + "\n" + numOfOraFallenOnHouse);
    }
}


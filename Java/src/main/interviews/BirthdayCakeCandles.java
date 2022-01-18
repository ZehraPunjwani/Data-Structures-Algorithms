
/*
Date: 
22nd March 2017

By: 
Zehra Punjwani
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumberOfCandles = in.nextInt();
        int height[] = new int[totalNumberOfCandles];
        for(int height_i = 0; height_i < totalNumberOfCandles; height_i++){
            height[height_i] = in.nextInt();
        }
        int maxVal = 0;
        int counter = 0;
        for(int j : height){
            if(j > maxVal){
                maxVal = j;
            }
        }
        for(int k : height){
            if(k == maxVal){
                counter++;
            }
        }
        System.out.println(counter);
    }
}


/*
Date: 
31st March 2017

By: 
Zehra Punjwani

Task:
There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). 
The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump. The second kangaroo starts 
at location x2 and moves at a rate of v2 meters per jump. Given the starting locations and movement rates for 
each kangaroo, can you determine if they'll ever land at the same location at the same time?
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int x1Pos = x1;
        int x2Pos = x2;
        int counter = 0;
        if(!(x2 > x1 && v2 > v1)){
            while(x1Pos != x2Pos && counter != 1000000){
                x1Pos += v1;
                x2Pos += v2;
                counter++;
            }
            if(counter == 1000000){
                System.out.println("NO");
            }
            if(x1Pos == x2Pos){
                System.out.println("YES");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}


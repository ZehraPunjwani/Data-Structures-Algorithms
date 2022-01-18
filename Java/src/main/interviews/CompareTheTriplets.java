/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
Your task is to find their comparison points by comparing  with ,  with , and  with .
If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.
Given  and , can you compare the two challenges and print their respective comparison points?

Input Format
The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Output Format
Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int aliceComp = 0;
        int bobComp = 0;
        
        if(a0 > b0){
            aliceComp++;
        }
        else if(a0 < b0){
            bobComp++;
        }
        
        if(a1 > b1){
            aliceComp++;
        }
        else if(a1 < b1){
            bobComp++;
        }
        
        if(a2 > b2){
            aliceComp++;
        }
        else if(a2 < b2){
            bobComp++;
        }
        
        System.out.println(aliceComp + " " + bobComp);
    }
}


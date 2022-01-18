/*
Date: 
28th March 2017

By: 
Zehra Punjwani

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. For each gradei, round it according to the rules above and print the result on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int CUT_OFF = 38;
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade >= CUT_OFF){;
                if(grade % 5 == 3){
                    System.out.println(grade + 2);
                }
                else if(grade % 5 == 4){
                    System.out.println(grade + 1);
                }
                else{
                    System.out.println(grade);
                }
            }
            else{
                System.out.println(grade);
            }
        }
    }
}


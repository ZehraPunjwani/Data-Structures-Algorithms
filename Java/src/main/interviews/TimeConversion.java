/*
Date: 
22nd March 2017

By: 
Zehra Punjwani

Task
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Input Format
A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM)

Output Format
Convert and print the given time in 24-hour format.
*/

import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String[] time = in.nextLine().split(":");
        String hrs = time[0];
        String mins = time[1];
        String secs = time[2].substring(0,2);
        String when = time[2].substring(2,4);
        if(when.equals("AM")){
            System.out.println((hrs.equals("12")?"00":hrs) +":"+mins+":"+secs);
        }
        else{
            System.out.println((hrs.equals("12")?hrs:(Integer.parseInt(hrs)+12))+":"+mins+":"+secs);
        }
    }
}
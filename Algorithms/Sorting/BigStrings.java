// The Idea is to use a comparator, whose sorting criteria is based on lengths, if two strings are of same length then we sort them 
// based on ASCII

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Checker implements Comparator<String>{
    public int compare(String s1, String s2){
        if(s1.length()==s2.length()){
            return s1.compareTo(s2);
        }
        return s1.length()-s2.length();
    }
}
public class Solution {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new Checker());
        for(String s : unsorted){
            System.out.println(s);
        }
    }
}

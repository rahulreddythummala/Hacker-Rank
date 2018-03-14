// Related to previous one, find the probability that atleast 1 defect is found at the 5th inspection

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }

    public static int combination(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        int defect=1;
        int n=5;
        double p=(double)1/3;
        double q=(double)2/3;
        double probability=(double)combination(n-1,0)*Math.pow(p,0)*Math.pow(q,n-0);
        System.out.printf("%.3f",1-probability);
    }
}

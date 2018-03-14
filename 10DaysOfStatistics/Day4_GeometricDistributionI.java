// The probability of a defective screw is 1/3, What is the probability that the 1 defect is found during the 5 inspection?

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
        double probability=(double)combination(n-1, defect-1)*Math.pow(p,defect)*Math.pow(q,n-defect);
        System.out.printf("%.3f",probability);
    }
}

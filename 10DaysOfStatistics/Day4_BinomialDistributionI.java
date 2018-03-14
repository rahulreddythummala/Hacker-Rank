// The ration of boys to girls in Russia is 1.09:1, find the number of six children families that will have atleast 3 boys

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
        int n=6;
        double p=1.09/2.09;
        double q=1/2.09;
        double probability=0;
        for(int i=0;i<=2;++i){
            probability+=(double)combination(n,i)*Math.pow(p,i)*Math.pow(q,n-i);
        }
        System.out.printf("%.3f%n",1-probability);
    }
}

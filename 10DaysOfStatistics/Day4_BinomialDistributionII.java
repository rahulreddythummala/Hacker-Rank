// Rejects or accepts of screws

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
        int n=10;
        double p=12/100;
        double q=88/100;
        double probability=0;
        for(int i=0;i<=2;++i){
            probability+=(double)combination(10,i)*Math.pow(0.12,i)*Math.pow(0.88,n-i);
        }
        double probability1=0;
        for(int i=0;i<2;++i){
            probability1+=(double)combination(10,i)*Math.pow(0.12,i)*Math.pow(0.88,n-i);
        }
        System.out.printf("%.3f%n",probability);
        System.out.printf("%.3f%n",1-probability1);
    }
}

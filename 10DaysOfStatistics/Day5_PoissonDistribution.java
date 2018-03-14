// Find the probability of getting 'k' successes where there is a lambda avg successes.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }
    
    static double poissionDistribution(double lambda, int K){
        double e=2.71828;
        return (double)((Math.pow(lambda,K))*(Math.pow(e,-lambda)))/(factorial(K));
    }
    
    public static void main(String[] args) {
        double lambda_mean=2.5;
        int K=5;
        System.out.printf("%.3f%n",poissionDistribution(lambda_mean, K));
    }
}

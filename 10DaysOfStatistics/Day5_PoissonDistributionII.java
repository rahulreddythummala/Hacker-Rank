// If the mean repairs for machine A is 0.88 and machine B is 1.55
// And cost function is C(A)=160+40*X^2, C(B)=128+40*Y^2
// find the expected daily cost


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        double meanRepairsA=0.88;
        double meanRepairsB=1.55;
        double costA=160+40*((meanRepairsA)+(meanRepairsA)*(meanRepairsA));
        double costB=128+40*((meanRepairsB)+(meanRepairsB)*(meanRepairsB));
        System.out.printf("%.3f%n%.3f%n",costA, costB);
    }
}

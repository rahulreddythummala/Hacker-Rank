// For a given find a number whose left sum is equal to right sum
// If there is no such number print NO, else YES

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        int len =a.length;
        int j=len-1;
        int i=0, sum1=0, sum2=0;
        while(i<len && j>=0){
            if(sum1==sum2 && ((i-j)==0)){
                return "YES";
            }else if(sum1<sum2){
                sum1+=a[i++];
            }else{
                sum2+=a[j--];
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}

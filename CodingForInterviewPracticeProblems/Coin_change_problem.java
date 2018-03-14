import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(int n, int[] c){
        // Complete this function
        long ways[] =new long[n+1]; // o to n =>n+1
        ways[0]=1;
        for(int i=0;i<c.length;++i){
            for(int j=c[i]; j<=n;++j){  // here j=c[i] coz any total less than coin value can't be represented;
                ways[j]+=ways[j-c[i]];   
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}

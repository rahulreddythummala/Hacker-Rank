// Base case table[0]=1
// and the consecutive indexes table[j]+=table[j-coins[i]]; i;e ways without count plus ways with coin

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long makeChange(int[] coins, int money) {
        int n=money+1;
        long[] table=new long[n];
        table[0]=1;
        for(int i=0;i<coins.length;++i){
            for(int j=coins[i];j<=money;++j){
                table[j]+=table[j-coins[i]];
            }
        }
        return table[money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}

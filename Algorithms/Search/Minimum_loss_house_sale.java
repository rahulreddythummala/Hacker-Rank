// The idea is to store prices into an array, and also map the price to year index
// Sort(ascending order) the array in NlogN, now traverse the prices
// consider the difference only when year_index of next element is lower than current element index
// because it is guaranteed to be sold at loss.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Long, Integer> mp=new HashMap<>();
        long[] prices=new long[n];
        for(int i=0;i<n;++i){
            prices[i]=sc.nextLong();
            mp.put(prices[i],i);
        }
        Arrays.sort(prices);
        long min=-1;
        for(int i=1;i<n;++i){
            long p1=prices[i-1];
            long p2=prices[i];
            if(p1<=p2 && mp.get(p1)>mp.get(p2)){
                long m=p2-p1;
                if(m<min || min==-1)
                    min=m;
            }
        }
        System.out.println(min);
    }    
}

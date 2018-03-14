import java.io.*;
import java.util.*;

public class Solution {
    private static Map<Integer, Integer> mp=new TreeMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;++i){
            int num=sc.nextInt();
            sum+=num;
            if(mp.get(num)==null){
                mp.put(num,1);
            }else{
                mp.put(num, mp.get(num)+1);
            }
        }
        double mean=(double)sum/n;
        int median_idx=0;
        double median=0;
        int mode=0;
        int freq=0;
        boolean two_terms=false;
        if(n%2==0) two_terms=true;
        int prev_median_idx=0;
        for(Map.Entry<Integer, Integer> e: mp.entrySet()){
            if(e.getValue()>freq){
                freq=e.getValue();
                mode=e.getKey();
            }
            median_idx+=e.getValue();
            if((prev_median_idx<n/2 & median_idx>n/2 & !two_terms) || (!two_terms && median_idx==n/2)){
                median=e.getKey();
            }else if( (prev_median_idx<n/2 & median_idx>n/2)||(median_idx==n/2) || ((median_idx-1)==n/2)){
                median+=e.getKey();
            }
            prev_median_idx=median_idx;
        }
        if(two_terms) median/=2;
        System.out.printf("%.1f%n%.1f%n%d%n",mean,median,mode);
    }
}

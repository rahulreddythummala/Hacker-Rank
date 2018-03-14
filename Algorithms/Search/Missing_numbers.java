// Find the missing numbers in the second array and print them in sorted order

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Map<Integer, Integer> freq_mp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;++i){
            int num=sc.nextInt();
            if(freq_mp.get(num)==null){
                freq_mp.put(num,1);
            }else{
                freq_mp.put(num,freq_mp.get(num)+1);
            }
        }
        int m=sc.nextInt();
        int[] ar=new int[m-n];
        for(int i=0, idx=0;i<m;++i){
            int num=sc.nextInt();
            if(freq_mp.get(num)==null || freq_mp.get(num)==0){
                ar[idx]=num;
                ++idx;
            }
            else
                freq_mp.put(num, freq_mp.get(num)-1);
        }
        Arrays.sort(ar);
        for(int i : ar){
            System.out.print(i+" ");
        }
    }
}

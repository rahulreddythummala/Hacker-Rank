//  Other approached for Two Sum Problem is
//  https://web.stanford.edu/class/cs9/lectures/04/Two-Sum.pdf

// For Q queries, find the two elements in an n elements array such that there sum is k
// then show the index
// Since we need to show the index so we must use a HashMap

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- > 0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            HashMap<Integer,Integer> price_idx=new HashMap<>();
            for(int i=0;i<n;++i){
                int p1=sc.nextInt();
                int comp=k-p1;
                if(price_idx.get(comp)!=null){
                    System.out.println(price_idx.get(comp)+" "+(i+1));
                }else{
                    price_idx.put(p1,i+1);
                }
            }
        }
    }
}

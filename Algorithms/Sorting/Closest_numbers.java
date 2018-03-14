// Find all the pairs of number whose difference is least, if there are multiple print them all

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;++i){
            nums[i]=sc.nextLong();
        }
        Arrays.sort(nums);
        long least_diff=2*10000001;
        for(int i=1; i<nums.length;++i){
            long diff=Math.abs(nums[i]-nums[i-1]);
            if(diff<least_diff){
                least_diff=diff;
            }
        }
        for(int i=1; i<nums.length;++i){
            long diff=Math.abs(nums[i]-nums[i-1]);
            if(diff==least_diff){
                if(nums[i]<nums[i-1])
                    System.out.print(nums[i]+" "+nums[i-1]+" ");
                else
                    System.out.print(nums[i-1]+" "+nums[i]+" ");
            }
        }
    }
}

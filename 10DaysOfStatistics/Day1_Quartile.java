/// Find Q1, Q2, Q3, such that they divide the data into four equal parts

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int findMedian(int[] nums, int start, int end){        
        int median;
        int size=end-start+1;
        if(size%2==0){
            median=(nums[start+size/2-1]+nums[start+size/2])/2;
        }else{
            median=nums[start+size/2];
        }
        return median;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;++i){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int Q2=findMedian(nums, 0, n-1);
        int Q1, Q3;
        if(n%2==1){     // If the numbers are odd, ignore the median
            Q1=findMedian(nums,0,n/2-1);
            Q3=findMedian(nums,n/2+1,n-1);
        }else{          // Else include the median
            Q1=findMedian(nums,0,n/2-1);
            Q3=findMedian(nums,n/2,n-1);
        }
        System.out.printf("%d%n%d%n%d%n",Q1,Q2,Q3);
    }
}

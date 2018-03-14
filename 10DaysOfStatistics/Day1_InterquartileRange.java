import java.io.*;
import java.util.*;

public class Solution {
    private static Map<Integer, Integer> mp=new TreeMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        int [] freqs=new int[n];
        for(int i=0; i<n; ++i){
           nums[i]=sc.nextInt();
        }
        int all_num=0;
        for(int i=0; i<n; ++i){
           freqs[i]=sc.nextInt();
           all_num+=freqs[i];
        }
        int[] all_nums=new int[all_num];
        int idx=0;
        for(int i=0;i<n;++i){
            int num=nums[i];
            int freq=freqs[i];
            for(int j=0;j<freq;++j){
                all_nums[idx]=num;
                idx++;
            }
        }
        Arrays.sort(all_nums);
        findInterquartile(all_nums);
    }
    
    public static void findInterquartile(int[] all_nums){
        double Q1, Q3;
        int l=all_nums.length;
        if(l%2==1){     // If the numbers are odd, ignore the median
            Q1=findMedian(all_nums,0,l/2-1);
            Q3=findMedian(all_nums,l/2+1,l-1);
        }else{          // Else include the median
            Q1=findMedian(all_nums,0,l/2-1);
            Q3=findMedian(all_nums,l/2,l-1);
        }
        System.out.printf("%.1f%n",Q3-Q1);
    }
    
     public static double findMedian(int[] nums, int start, int end){        
        double median;
        int size=end-start+1;
        if(size%2==0){
            median=(double)(nums[start+size/2-1]+nums[start+size/2])/2;
        }else{
            median=nums[start+size/2];
        }
        return median;
    }
}

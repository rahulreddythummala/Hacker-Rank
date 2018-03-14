import java.io.*;
import java.util.*;

public class Solution {

    public static double findMean(int[] nums, Scanner sc){
        long sum=0;
        for(int i=0; i<nums.length; ++i){
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        return (double)sum/nums.length;
    }
    
    public static double findStandardDeviation(int[] nums, double mean){
        long sum_sd=0;
        for(int i=0;i<nums.length;++i){
            sum_sd+=Math.pow((nums[i]-mean),2);
        }
        return Math.sqrt(sum_sd/nums.length);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        double mean=findMean(nums,sc);
        System.out.printf("%.1f%n",findStandardDeviation(nums, mean));
    }
}

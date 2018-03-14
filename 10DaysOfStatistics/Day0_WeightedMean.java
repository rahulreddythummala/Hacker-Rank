import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;++i){
            nums[i]=sc.nextInt();
        }
        long sum=0;
        long all_weights=0;
        for(int i=0;i<n;++i){
            int weight=sc.nextInt();
            sum+=(nums[i]*weight); 
            all_weights+=weight;
        }
        System.out.printf("%.1f%n",(double)sum/all_weights);
    }
}

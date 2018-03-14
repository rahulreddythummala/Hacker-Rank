import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;++i){
            nums[i]=sc.nextInt();
        }
        int diff1=0, diff2=0, triplets=0;
        for(int i=1; i<n-1;++i){    // 1 2 4 5 7 8 10
            for(int j=0;j<i;++j){
                diff1=nums[i]-nums[j];
 //               System.out.printf("1: %d %d %d%n", nums[i], nums[j], diff1);
                if(diff1==d)
                    break;
            }
            if(diff1==d)
                for(int k=i+1;k<n;++k){
                    diff2=nums[k]-nums[i];
//                    System.out.printf("2: %d %d %d%n", nums[k], nums[i], diff2);
                    if(diff2==d)
                        break;
                }
            else 
                continue;
            if(diff2==d)
                triplets++;
        }
        System.out.println(triplets);
    }
}

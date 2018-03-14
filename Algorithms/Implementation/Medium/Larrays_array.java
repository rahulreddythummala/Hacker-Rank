// If the number of inversions are even then the array is solvable, since we're assuming the grid width to be odd
// as the robot can rotate three tiles at once
// concept:  https://www.cs.bham.ac.uk/~mdr/teaching/modules04/java2/Tiles.html
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int j=0;j<q;++j){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<nums.length;++i){
                nums[i]=sc.nextInt();
            }
            process(nums);
        }
    }
    public static void process(int[] nums){
        int inversions=0;
        for(int i=0;i<nums.length-1;++i)
            for(int j=i+1;j<nums.length;++j)
                if(nums[i]>nums[j])
                    inversions++;
        if(inversions%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
// https://www.hackerrank.com/challenges/larrys-array/problem

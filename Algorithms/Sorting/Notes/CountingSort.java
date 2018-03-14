
// It is assumed that all the elements are from 1 to 100, else we may need to find the range of numbers
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        int[] freq= new int[100];
        int[] sorted=new int[n];
        for(int i=0;i<n;++i){
            ++freq[sc.nextInt()];
        }
        int idx=0;
        for(int i=0;i<freq.length;++i){
            int f=freq[i];
            for(int j=0;j<f;++j){
                sorted[idx]=i;
                ++idx;
            }
        }
        for(int i : sorted)
            System.out.print(i+" ");
    }
} 

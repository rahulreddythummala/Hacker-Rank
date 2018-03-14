import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] num = new int[100];
        int max=-1;
        for(int i=0;i<n;++i){
            ++num[sc.nextInt()-1];
        }
        for(int i=0;i<num.length;++i){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(n-max);
    }
}

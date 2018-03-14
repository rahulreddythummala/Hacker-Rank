import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int bdays=0;
        for(;i<=j;++i){
           int diff = Math.abs(i - reverse(i));
           if(diff%k==0)
                bdays++;
        }
        System.out.println(bdays);
    }
    public static int reverse(int d){
        int rev=0;
        int mul=1;
        while(d>0){
            rev+=(d%10);            
            d=d/10;
            if(d>0)
                rev*=10;
        }
        return rev;
    }
}

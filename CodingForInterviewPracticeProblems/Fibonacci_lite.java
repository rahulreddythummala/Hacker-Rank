import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("0");
            return;
        }
        long a=1, b=1;
        while(n--> 1){
            long c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}

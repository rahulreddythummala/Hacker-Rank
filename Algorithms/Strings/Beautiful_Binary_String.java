// String must not have 010 pattern, so the best way to change the last character

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        int del=0;
        char first=B.charAt(0);
        char second=B.charAt(1);        
        for(int i=2;i<B.length();++i){
            char third=B.charAt(i);
            if(first=='0' && second=='1'
              && third=='0'){
                del++;
                first=second;
                second='1';
            }else{
                first=second;
                second=third;
            }
        }
        return del;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

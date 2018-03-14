import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long total=0;
        long num_a=0;
        if(n<s.length()){
            for(int i=0; i<n;++i){
                if(s.charAt(i)=='a')
                    ++num_a;
            }
            System.out.println(num_a);
            return;
        }
        for(int i=0; i<s.length();++i){
            if(s.charAt(i)=='a')
                ++num_a;
        }
        if(num_a==s.length()){
            System.out.println(n);
            return;
        }
//        System.out.println(num_a);
        long rem=(long)n/s.length();
//        System.out.println("Rem: "+rem);
        total+=(rem*num_a);
        n-=(rem*s.length());
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')
                ++total;
        }
        System.out.println(total);
    }
}

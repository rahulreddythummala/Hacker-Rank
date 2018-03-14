import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        int a=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean f=false;
        for(int i=0;i<s.length();++i){
            if(Character.isLetter(s.charAt(i)))
                a = a | (1<<(s.charAt(i)-'a'));
            if(a==Math.pow(2,26)-1){
                f=true;
                break;
            }                
        }
        if(f)
            System.out.println("pangram");
        else System.out.println("not pangram");
    }
}

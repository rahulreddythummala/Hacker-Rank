import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        k%=26;
        String r="";
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch>='a' & ch<='z'){
                    ch=(char)(ch+k);
                    if(ch>'z'){
                        ch%=(char)'z';
                        ch+='a'-1;
                    }
                }
                else{
                    ch=(char)(ch+k);
                     if(ch>'Z'){
                        ch%=(char)'Z';
                        ch+='A'-1;
                    }
                }
                r+=ch;
            }
            else r+=s.charAt(i);
        }
        System.out.println(r);
    }
}

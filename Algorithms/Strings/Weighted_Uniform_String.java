import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int [] wghs=new int[s.length()];
        char prev='1';
        int wprev=0;
        for(int i=0;i<s.length();++i){
            int w=s.charAt(i)-'a'+1;
            if(prev==s.charAt(i)){
                wprev+=w;
            }
            else wprev=w;
            wghs[i]=wprev;
            prev=s.charAt(i);            
        }
        for(int i=0;i<n;++i){
            int x=in.nextInt();
            boolean f=false;
            for(int w : wghs){
                if(x==w){
                    f=true;
                    break;
                }
            }
            if(f)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

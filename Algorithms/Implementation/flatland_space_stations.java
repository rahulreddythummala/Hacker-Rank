import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s[] = new int[m];
        int c[] = new int[n]; 
        for(int i=0;i<n;++i) c[i]=n;
        for(int s_i=0; s_i < m; s_i++){
            s[s_i] = in.nextInt();
            c[s[s_i]]=0;
        }
        int max=0;
        for(int i=0;i<n;++i){
            if(c[i]==0)
                continue;
            else{
                for(int s_i: s){
                    if(c[i]>Math.abs(s_i-i))
                        c[i]=Math.abs(s_i-i);
                }
            }
            if(c[i]>max)
                max=c[i];
        }
        System.out.println(max);
    }
}

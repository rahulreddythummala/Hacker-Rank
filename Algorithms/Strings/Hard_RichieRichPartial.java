// For a given number of size n, make changes upto k, so that it's palindrome as well as the largest
// The approach is to solve the problem in two passes
// 1. First pass try making the string a palindrom(with 0, last element as exceptions)\
// Now check if the last two characters doesn't match and left over k=1, if so then update each one of them to be the highest
// If number of mismatches are above k, then we can change each mismatch to '9'
// So reset the k value to initial, and start the second pass
// In the second pass begin from the ends and trying making each element as '9'
// If the length is odd and k==1, then make the middle element as '9'

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String richieRich(String s, int n, int kit){
        int k=kit;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();++i){
            str.append('9');
        }
        if(k>=s.length())    // If allowed changes are greater than the characters itself
            return str.toString();
        int j=n/2;
        if(n%2==1) j+=1;
        int mismatch=0;
        for(int i=n/2-1;i>0 & j<n-1;--i,++j){  // Starting from middle
            if(s.charAt(i)!=s.charAt(j)){   // if there is a mismatch try to correct it don't replace it with '9'
                if(k>0) k--;
                else return "-1";
                if(s.charAt(i)>s.charAt(j)){
                    s=s.substring(0,j)+s.charAt(i)+s.substring(j+1);
                }else{
                    s=s.substring(0,i)+s.charAt(j)+s.substring(i+1);
                }
                ++mismatch;
            }
        }
        if(s.charAt(0)!=s.charAt(n-1)){
            if(k==1){
                if(s.charAt(0)>s.charAt(n-1)){
                    s=s.charAt(n-1)+s.substring(1);
                }else{
                    s=s.substring(0,n-1)+s.charAt(0);
                }
                --k;
                return s;
            }else if(k<1){
                return "-1";
            }
        }
        if(mismatch<=k+2){
            k=kit;
        }
 //       System.out.println("String after clearning: "+s+" k left: "+k+" kit value: "+kit);
        int jLimit=n/2;
        if(n%2==1)
            jLimit+=1;
        j=n-1;
        for(int i=0;i<n/2 && j>=jLimit;++i,--j){
            if(s.charAt(i)=='9' && s.charAt(j)=='9')
                continue;
            if(s.charAt(i)=='9' || s.charAt(j)=='9')
                k++;
            if(k>=2){
  //              System.out.println("before weaving: "+s);
                s=s.substring(0,i)+'9'+s.substring(i+1,j)+'9'+s.substring(j+1);
                k-=2;
            }
        }
        if(k>=1 && n%2==1){
            s=s.substring(0,s.length()/2)+'9'+s.substring(s.length()/2+1);
        }
     //   System.out.println("After weaving: "+s);
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}

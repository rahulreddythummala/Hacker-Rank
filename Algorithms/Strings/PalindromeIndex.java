import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int palindromeIndex(String s){
        boolean mismatch=false;
        int alt=-1;
        for(int i=0,j=s.length()-1;i<s.length()/2;++i,--j){
            if(s.charAt(i)!=s.charAt(j)){
                if(mismatch){   // If there is another mismatch then return the letter from back
                                // for the first mismatch
                    return s.length()-alt-1;
                }else{
                    mismatch=true;
                    alt=i;
                    ++j;    // Let's reset back j
                }
            }
        }
        return alt;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}

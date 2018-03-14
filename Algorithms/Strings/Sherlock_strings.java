// All characters is a string must have same frequency except one character
// The idea is to count the frequency of each character and then make sure that only one freq count is different
// To do this get the variation in frequencies, there should be at most two kind of frequencies
// of the two only one should be most repeating frequency
// else it doesn't satisfy the condition

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
        int [] chars=new int[26];       
        for(int i=0;i<s.length();++i){
            ++chars[s.charAt(i)-'a'];        
        }
        int f1=-2, f2=-2, mrf=-2;
        for(int i : chars){
            if(i!=0){
                if(f1==-2 && f2==-2){   // If neither of frequencies set
                    f1=i;
                }else if(f2==-2 && i!=f1){  // If f2 is not set and the value if different from f1
                    f2=i;
                }else if(f1==-2 && i!=f2){  // If f1 is not set and the value if different from f2
                    f1=i;
                }else if(f1!=-2 || f2!=-2){             // else if there is a repetiton, then its the most repeating freq
                    if(mrf==-2 && (i==f1 || i==f2)){  // No if mrf is not set, set mrf and make sure that is one of f1, f2
                        mrf=i;          //
                    }else if(i!=mrf){
                        return "NO";
                    }
                }
            }
        }
         
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}



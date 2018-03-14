// For a given string, count the number of deletions to be made so that no consecutive characters are same
// The idea is to check the similiar consecutive characters, which is same as deletions

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        int del=0;
        for(int i=1;i<s.length();++i)
            if(s.charAt(i)==s.charAt(i-1))
                del++;
        return del;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}


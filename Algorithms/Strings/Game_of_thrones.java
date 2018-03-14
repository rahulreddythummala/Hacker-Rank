import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        int[] cnt=new int[26];
        for(int i=0;i<s.length();++i){
            ++cnt[s.charAt(i)-'a'];
        }
        boolean one_odd=false;
        for(int i : cnt){
            if(i%2==1){
                if(one_odd)
                    return "NO";
                else one_odd=true;
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}

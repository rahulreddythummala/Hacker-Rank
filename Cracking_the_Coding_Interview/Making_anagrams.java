// The idea is to cound the number of different characters in both the strings
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      int [] chars=new int[26];
      for(int i=0;i<first.length();++i){          
          ++chars[first.charAt(i)-'a'];
      }
      int count=0;
      for(int i=0;i<second.length();++i){          
          --chars[second.charAt(i)-'a'];          
      }
        for(int i : chars){
            if(i!=0)
                count+=Math.abs(i);
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

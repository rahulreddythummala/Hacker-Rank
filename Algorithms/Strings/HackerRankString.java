import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String msg="hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int i=0, j=0;
            while(i<msg.length() & j<s.length()){
                if(msg.charAt(i)==s.charAt(j)){
                    ++i;                    
                }
                ++j;
            }
            if(i<msg.length()){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}

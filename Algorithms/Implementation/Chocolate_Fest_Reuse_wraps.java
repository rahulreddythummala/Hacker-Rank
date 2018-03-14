import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();   // 6
            int c = in.nextInt();   // 2
            int m = in.nextInt();   // 2
            int choco=0;
            if(n>=c){
                choco=n/c;          // 3
                n-=(c*choco);       // 0
                int wrap=choco;     // 3
                while(wrap>=m){     // 3>=2
                    int choc=(wrap/m);  // 1
                    wrap-=(choc*m);     // 1 
                    wrap+=choc;          
                    choco+=choc;
                }
            }
            System.out.println(choco);
        }
    }
}

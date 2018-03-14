import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int E=100;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=0;
        do{
            int nxt=(i+k)%n;
            E-=1;
            if(c[nxt]==1)
                E-=2;
            i=nxt;
        }while(i!=0);
        System.out.println(E);
    }
}

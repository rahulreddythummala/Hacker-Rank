import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- > 0){
            TreeSet<Integer> hs=new TreeSet<>();
            int stn=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=0;i<stn;++i){
                hs.add(a*(stn-i-1)+b*i);
            }
            for(int i : hs){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

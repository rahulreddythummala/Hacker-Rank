        
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                System.out.println("0");
                continue;
            }
            BigInteger a=new BigInteger("1");
            BigInteger b=new BigInteger("1");
            while(n--> 1){
                BigInteger c=new BigInteger("0");
                c=c.add(a).add(b);
                a=b;
                b=c;
            }
            System.out.println(a);
        }
    }
}

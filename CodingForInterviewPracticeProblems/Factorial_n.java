import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        BigInteger b=new BigInteger("1");
        while(n>0){
            b=b.multiply(new BigInteger(String.valueOf(n)));
            n--;
        }
        System.out.println(b);
    }
}

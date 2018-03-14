import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int an=sc.nextInt();
        int bn=sc.nextInt();
        boolean flag=false;
        for(int n=an;n<=bn;++n){
            BigInteger sqr=new BigInteger("1");
            sqr=sqr.multiply(BigInteger.valueOf(n));
            sqr=sqr.multiply(BigInteger.valueOf(n));
            String str=String.valueOf(sqr.toString());
            String a="", b=""; long rst;
            if(n==1){
                flag=true;
                System.out.print("1 ");
                continue;
            }
            if(str.length()%2==0){                
                for(int i=0, j=str.length()/2;i<str.length()/2;++i, ++j){
                    a+=str.charAt(i);
                    b+=str.charAt(j);                    
                }                
                long num1=0, num2=0;
                if(a.length()>0){
                    num1=Integer.valueOf(a);
                }
                if(b.length()>0){
                    num2=Integer.valueOf(b);
                }
                rst=num1+num2;
                if(num1==0 || num2==0) continue;
//                System.out.printf("n: %d, str %s , a %s, b%s, rst %d",n,str,a,b,rst);
                if(n==rst){
                    flag=true;
                    System.out.print(n+" ");
                }
            }
            else{
                int mid=str.length()/2;   // mid=2 , str=5 0 1 2 3 4
                for(int i=0, j=mid;j<str.length();++j){
                    if(i<mid){
                        a+=str.charAt(i);
                        ++i;
                    }
                    b+=str.charAt(j);
                }
                long num1=0, num2=0;
                if(a.length()>0){
                    num1=Integer.valueOf(a);
                }
                if(b.length()>0){
                    num2=Integer.valueOf(b);
                }
                if(num1==0 || num2==0) continue;
                rst=num1+num2;
//                System.out.printf("1 n: %d, str %s , a %s, b%s, rst %d",n,str,a,b,rst);
                if(n==rst){
                    flag=true;
                    System.out.print(n+" ");
                    continue;
                }
                a=""; b="";
                for(int i=0,j=mid+1;i<=mid;++i){
                    a+=str.charAt(i);
                    if(j<str.length()){                        
                        b+=str.charAt(j);
                        j++;
                    }
                    
                }
                num1=0; num2=0;
                if(a.length()>0){
                    num1=Integer.valueOf(a);
                }
                if(b.length()>0){
                    num2=Integer.valueOf(b);
                }
                if(num1==0 || num2==0) continue;
                rst=num1+num2;
//                System.out.printf("2 n: %d, str %s , a %s, b%s, rst %d",n,str,a,b,rst);
                if(n==rst){
                    flag=true;
                    System.out.print(n+" ");
                }
            }
//            System.out.println();
        }
        if(!flag)
            System.out.println("INVALID RANGE");
    }
}

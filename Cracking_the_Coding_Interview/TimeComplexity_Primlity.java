// Check if the number is a prime in O(root n)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        more: for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(n==1){
                System.out.println("Not prime");
                continue more;
            }            
            for(int i=2;i*i<=n;++i){
                if(n%i==0){
                    System.out.println("Not prime");
                    continue more;
                }
            }
            System.out.println("Prime");
        }
    }
}

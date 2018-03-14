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
        int[] x=new int[n];
        for(int i=0;i<n;++i){
            x[i]=in.nextInt();
        }
        Arrays.sort(x);
        int numOfTransmitters = 0;
        int i = 0;
        while (i < n) {
            numOfTransmitters++;        // Atleast there will be one trasmitted installed
            int loc = x[i] + k;
            while (i < n && x[i] <= loc)    // Let's look ahead upto k+1 addresses
                i++;
            loc = x[--i] + k;               // If there are k+1 addresses, then let set a loc at kth address
            while (i < n && x[i] <= loc)    // Let's continue to look ahead
                i++;
        }
        System.out.println(numOfTransmitters);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curr= in.nextInt();
        int next= in.nextInt();
        int jumps=0;
        int next_n=-1;                  //Let's assume that next_next is not reachable
        for(int c_i=2;c_i < n; c_i++){
            next_n=in.nextInt();
            if(next_n==1){
                curr=next;
                next=next_n;
                jumps++;
            }
            else{
                curr=next_n;
                jumps++;
                c_i++;
                if(c_i==n){
                    break;                   
                }
                next=in.nextInt();
                next_n=-1;          // *** If next_next is not reachable
            }
        }
        if(next_n==-1) jumps++;     // If not reachable, let's just jump one step and win
        System.out.println(jumps);
    }
}

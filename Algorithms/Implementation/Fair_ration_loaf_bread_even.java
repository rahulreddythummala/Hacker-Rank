import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int prev;
        int brds=0;
        for(int i=0;i<N;++i){
            int curr=B[i];
            if(curr%2==0){
                prev=curr;
                continue;
            }
            else{
                if(i<N-1){
                    ++B[i+1];
                    prev=++B[i];
                    brds+=2;
                }
                else{
                    ++B[i-1];
                    prev=B[i-1];
                    brds+=2;
                }
            }
            if(prev%2!=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(brds);
    }    
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private Stack<Integer> A, B;
    private boolean debug=true;
    public Solution(){
        A = new Stack<>();
        B = new Stack<>();
    }
    public void prepStack(Stack<Integer> st, int[] ar){
        for(int i=ar.length-1; i >=0 ;--i){
            st.push(ar[i]);
        }
    
    }
    
    public int playGame(int cut_off){
        int score=0, removals=0;
        while((!A.isEmpty())||
              (!B.isEmpty())){
            int a1=A.isEmpty()? -1 : A.peek();
            int b1=B.isEmpty()? -1 : B.peek();
            if(debug)
                System.out.printf("a1 = %d b1 =%d, score = %d %n", a1, b1, score);
            if(a1==-1){
                if((b1+score) > cut_off)
                    break;
                else{
                    score+=b1;
                    removals++;
                    if(debug)
                        System.out.println("Taking off: "+B.peek());
                    B.pop();
                }
            }
            else if(b1==-1){
                if((a1+score) > cut_off)
                    break;
                else{
                    score+=a1;
                    removals++;
                    if(debug)
                        System.out.println("Taking off: "+A.peek());
                    A.pop();
                }
            }
            else if(a1<b1){
                if((a1+score) > cut_off)
                    break;
                else{
                    score+=a1;
                    removals++;
                    if(debug)
                        System.out.println("Taking off: "+A.peek());
                    A.pop();
                }
            }
            else{
                if((b1+score) > cut_off)
                    break;
                else{
                    score+=b1;
                    removals++;
                    if(debug)
                        System.out.println("Taking off: "+B.peek());
                    B.pop();
                }
            }
        }
        return removals;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            Solution sln=new Solution();
            sln.prepStack(sln.A,a);
            sln.prepStack(sln.B,b);
            System.out.println(sln.playGame(x));
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Node{
    int data;
    int max_so_far;
    public Node(int d, int m){
        data=d;
        max_so_far=m;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Node> st=new Stack<>();
        int num_q=sc.nextInt();
        int max=-10000;
        while(num_q-- > 0){
            int a=sc.nextInt();
            if(a==1){
                int b=sc.nextInt();
                if(b>max){
                    max=b;
                }
                st.add(new Node(b,max));
            }
            else if(a==2){
                st.pop();
                if(st.isEmpty()) max=-10000;
                else max=st.peek().max_so_far;
            }
            else{
                System.out.println(st.peek().max_so_far);
            }
        }
    }
}

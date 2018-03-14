import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class MyQueue{
    private Stack<Integer> st1, st2;
    public MyQueue(){
        st1=new Stack<>();
        st2=new Stack<>();
    }
    public void enqueue(int n){
        st1.push(n);
    }
    public int dequeue(){
        if(st2.isEmpty()){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }
    public int front(){
        if(st2.isEmpty()){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
}
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyQueue q=new MyQueue();
        int num_q=sc.nextInt();
        while(num_q-- > 0){
            int a=sc.nextInt();
            if(a==1){
                int b=sc.nextInt();
                q.enqueue(b);
            }
            else if(a==2){
                q.dequeue();
            }
            else{
                System.out.println(q.front());
            }
        }
    }
}

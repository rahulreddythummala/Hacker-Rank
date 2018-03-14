import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int ops=sc.nextInt();
        while(ops-- > 0){
            int q=sc.nextInt();
            if(q==1){
                int v=sc.nextInt();
                pq.offer(v);
            }
            else if(q==2){
                int v=sc.nextInt();
                pq.remove(v);
            }
            else{
                System.out.println(pq.peek());
            }
        }
    }
}

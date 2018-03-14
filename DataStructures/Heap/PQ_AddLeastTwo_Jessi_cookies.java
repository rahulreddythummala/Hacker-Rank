import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num_cookies=sc.nextInt();
        int sweetness=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(num_cookies-- > 0){
            pq.add(sc.nextInt());
        }       
        int ops=0;
        while(!pq.isEmpty()){
            int least_sweet_cookie= pq.peek();            
            if(least_sweet_cookie>=sweetness){
                System.out.println(ops);
                return;
            }
            pq.remove(least_sweet_cookie);
            if(pq.isEmpty()) break;
            int second_least_cookie=pq.poll();
            int new_cookie= least_sweet_cookie + 2*second_least_cookie;
            ops++;
            pq.add(new_cookie);                
        }
        System.out.print("-1");
    }
}

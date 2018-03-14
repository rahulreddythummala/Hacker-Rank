// The idea is to use to PQ's called low(reverseOrder()) and high
// Low will store all the elements in ascending order
// High will store all the elements in descending order
// Whenever a new elements is inserted, it occupied the array whose length is shorter
// else it will be inserted into the low array
// After insertion a balanace() method is called, which check's if the element which is just inserted is into the right array
// since the recent element will be the head of PQ, and if there is an imbalance then heads are swapped
// balancing is done for each and ever insertion
// Now median can be computed as
// The average of heads if both PQ's are of same length
// Else the head of the low(since we're inserting into low incase of same length)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private PriorityQueue<Integer> low=new PriorityQueue<>(Comparator.reverseOrder());
    private PriorityQueue<Integer> high=new PriorityQueue<>();
    public Solution(){
        
    }
    public void add(Integer num){
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(num);
        balance();
    }
    public void balance(){
        while(!high.isEmpty() && !low.isEmpty() && low.peek()>high.peek()){
            int lowHead=low.poll();
            low.add(high.poll());
            high.add(lowHead);
        }
    }
    public double median(){
        return low.size() == high.size() ? (((double)low.peek()+high.peek())/2) : (low.peek()) ;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sln=new Solution();
        for(int i=0;i<n;++i){
            sln.add(sc.nextInt());
            System.out.printf("%.1f%n", sln.median());
        }
    }
}

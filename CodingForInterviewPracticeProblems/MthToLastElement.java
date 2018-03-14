import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Node{
    int data;
    Node next;
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size=0;
    public LinkedList(int data){
        head=new Node(data,null);
        tail=head;
        size++;
    }
    public void add(int data){
        Node n=new Node(data, null);
        tail.next=n;
        tail=n;
        size++;
    }
    public void nthToLast(int n){
        Node tmp=head;
//        System.out.println("Size: "+size+" asking for k: "+(size-n+1));
        int k=size-n+1;
        if(k<=0){
            System.out.println("NIL");
            return;
        }
        tmp=head;
        while(k>1){
            tmp=tmp.next;
            k--;
        }
        System.out.println(tmp.data);
    }
}
public class Solution {    
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(sc.readLine());
        String numbers=sc.readLine();
        String nums[]=numbers.split(" ");
        LinkedList ll=new LinkedList(Integer.valueOf(nums[0]));
        for(int i=1;i<nums.length;++i){
            ll.add(Integer.valueOf(nums[i]));
        }
        ll.nthToLast(n);
    }
}

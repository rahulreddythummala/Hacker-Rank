import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private ArrayList<Integer> depths;
    private ArrayList<Integer> l_nodes;
    private ArrayList<Integer> r_nodes;
    private int num;
    Scanner sc=new Scanner(System.in);
    
    public Solution(){
        depths=new ArrayList<>();
        l_nodes=new ArrayList<>();
        r_nodes=new ArrayList<>();
    }
    
    public void depth(int cur, int d){
        depths.set(cur, d);
        if(l_nodes.get(cur) > 0) depth(l_nodes.get(cur), d+1);
        if(r_nodes.get(cur) > 0) depth(r_nodes.get(cur), d+1);
    }
    
    public void inOrder(int cur){
        if(l_nodes.get(cur)>0) inOrder(l_nodes.get(cur));
        System.out.print(cur+" ");
        if(r_nodes.get(cur)>0) inOrder(r_nodes.get(cur));
    }
    
    public void readData(){
        num=sc.nextInt();
        l_nodes.add(1);
        r_nodes.add(1);
        for(int i=1; i<=num; ++i){
            int l=sc.nextInt();
            int r=sc.nextInt();
            l_nodes.add(l);
            r_nodes.add(r);
        }
        for(int i=0;i<=2*num;++i){
            depths.add(0);
        }
    }
    
    public static void main(String[] args) {
       Solution s=new Solution();
       s.readData();
       s.depth(1,1);      
       int ops=s.sc.nextInt();
       for(int i=0;i<ops;--ops){
           int k=s.sc.nextInt();
           for(int j=1;j<=s.num;++j){
               if((s.depths.get(j)%k)==0){
                   int temp=s.l_nodes.get(j);
                   s.l_nodes.set(j,s.r_nodes.get(j));
                   s.r_nodes.set(j,temp);
               }
           }
           s.inOrder(1);
           System.out.println();
       }
    }
}

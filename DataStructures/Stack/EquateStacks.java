/**
Prepare stack with cylinders(current height and height so far(hsf)).
check the hieghts, which stack has more height pop the cylinders
and check hsf again untill the height is adjusted or stacks are empty,
in which case return height 0
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Cylinder{
    int h;      // current height
    int hsf;    // height so far
    public Cylinder(int h, int hsf){
        this.h=h;
        this.hsf=hsf;
    }
}
public class Solution {
    private Stack<Cylinder> st1, st2, st3;
    public Solution(){
        st1=new Stack<>();
        st2=new Stack<>();
        st3=new Stack<>();
    }
    public void prepStack(Stack<Cylinder> st, int[] ar){
        int ht=0;
        for(int i=ar.length-1;i>=0;--i){
            ht+=ar[i];
            st.push(new Cylinder(ar[i],ht));
        }
    }
    public boolean adjusted(){
        return (st1.peek().hsf == st2.peek().hsf) 
            && (st2.peek().hsf == st3.peek().hsf);
    }
    public int adjustHeight(){
        while(!st1.isEmpty() && !st2.isEmpty()
                && !st3.isEmpty()){
            int h1=st1.peek().hsf;
            int h2=st2.peek().hsf;
            int h3=st3.peek().hsf;
            if(adjusted())
                return h1;
            if(h1>h2){
                if(h1>h3){
                    st1.pop();
                }
                else{
                    st3.pop();
                }
            }
            else{
                if(h2>h3){
                    st2.pop();
                }
                else{
                    st3.pop();
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        Solution sln=new Solution();
        sln.prepStack(sln.st1,h1);
        sln.prepStack(sln.st2,h2);
        sln.prepStack(sln.st3,h3);
        System.out.println(sln.adjustHeight());
    }
}

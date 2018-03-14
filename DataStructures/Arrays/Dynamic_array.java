import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int num_q=sc.nextInt();
        int lastAnswer=0;
        ArrayList<ArrayList<Integer>> seqList=new ArrayList<>();
        for(int i=0;i<N;i++)
            seqList.add(new ArrayList<Integer>());
        for(int i=0;i <num_q; ++i){
            int op=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int idx=(x^lastAnswer)%N;
            if(op==1){
                seqList.get(idx).add(y);
            }
            else{
                int size=seqList.get(idx).size();
                lastAnswer=seqList.get(idx).get(y%size);
                System.out.println(lastAnswer);
            }
        }
    }
}

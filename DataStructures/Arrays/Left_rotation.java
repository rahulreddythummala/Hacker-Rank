import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int r=sc.nextInt();
        r=r%N;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<N;i++){
            System.out.print(list.get((i+r)%N)+" ");
        }
    }
}

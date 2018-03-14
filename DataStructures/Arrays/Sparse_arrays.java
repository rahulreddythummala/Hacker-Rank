import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> str_counter=new HashMap<>();
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String str=sc.nextLine();
            if(str_counter.containsKey(str)){
                int f= str_counter.get(str);
                str_counter.put(str, ++f);
            }
            else str_counter.put(str,1);
        }
        int Q=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<Q;++i){
            String str=sc.nextLine();
            if(str_counter.containsKey(str))
                System.out.println(str_counter.get(str));
            else System.out.println(0);
        }
    }
}

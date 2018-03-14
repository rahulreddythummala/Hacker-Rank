// The idea is to store the number of ways for a given n into a map
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static HashMap<Integer, Long> mp=new HashMap<>();
    public static long ways(int n){
        if(n==0) return 0;
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        else if(mp.get(n)==null){
            long wy=ways(n-1)+ways(n-2)+ways(n-3);
            mp.put(n,wy);
        }
        return mp.get(n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(ways(n));
        }
    }
}

// The task to find two integers in a linear array such that there sum equal to some number n
// The idea is to read the number and check for comp=n-num; if it is found in the map then return the index
// and ignore the left over array elements(if it's guaranteed that only one solution is possible)
// else put the cost and index into the map.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Map<Integer, Integer> mp=new HashMap<>();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                int cost=in.nextInt();
                int comp=m-cost;
                int l_id=a_i;
                if(mp.get(comp)==null){
                    mp.put(cost, a_i);
                    continue;
                }
                int u_id=mp.get(comp);
                if(l_id > u_id){
                   System.out.printf("%d %d%n", u_id+1, l_id+1);
                }else{
                    System.out.printf("%d %d%n", l_id+1, u_id+1);
                }
                mp.clear();
                in.nextLine();
                break;
            }
        }
    }
}

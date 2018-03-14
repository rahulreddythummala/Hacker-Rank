import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chapters=sc.nextInt();      // 5
        int prob_per_page=sc.nextInt(); // 3
        int page_num=1;
        int spe=0;
        // 4 2 6 1 10
        for(int i=1;i<=chapters;++i){
            int probs=sc.nextInt(); //4
            int p_st=1, p_end;
            while(probs>0){         
                if(probs>=prob_per_page){
                     probs-=prob_per_page;          // 1
                     p_end=p_st+prob_per_page-1;    // 3            
                }
                else{
                    p_end=p_st+probs-1; // 4
                    probs=0;
                }
                if(page_num>=p_st && p_end>=page_num)
                        spe++;
                page_num++;         // 2
                p_st=p_end+1;      // 4
            }
        }
        System.out.println(spe);
    }
}

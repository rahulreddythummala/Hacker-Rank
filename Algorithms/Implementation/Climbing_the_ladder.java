import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int prev=0;
        int idx=0;
        for(int scores_i=0; scores_i < n; scores_i++){
            int score = in.nextInt();
            if(score!=prev){
                scores[idx]=score;
                prev=score;
                idx++;
            }
        }        
        int m = in.nextInt();
        int[] alice = new int[m];
        prev=-1;
        if(idx==scores.length) idx--;
        for(int alice_i=0; alice_i < m; alice_i++){
            int scr = in.nextInt();
            if(prev==scr){
                System.out.println(idx+1);
                continue;
            }
            while(true){
                if(scores[idx]>scr){
                    System.out.println(idx+1);                    
                    break;
                }
                else if(scores[idx]==scr){
                    System.out.println(idx+1);
                    break;
                }
                else if(scores[idx] < scr){
                    if(idx>0){
                        if(scr < scores[idx-1]){
                            System.out.println(idx+1);
                            break;
                        }
                        else{
                            idx--;
                            continue;
                        }
                    }
                    else if(idx<0){
                        System.out.println("1");
                        break;
                    }
                    else{
                        System.out.println(idx+1);
                        break;
                    }
                }
                               
            }
            prev=scr;
        }
    }
}

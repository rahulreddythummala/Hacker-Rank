import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] most_skills=new int[m];
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int mx=0,cnt, count=0;     
        for(int i=0;i<n;++i){            
            BitSet first_person=new BitSet(n);
            for(int k=0;k<topic[i].length();++k){
                if(topic[i].charAt(k)=='1')
                    first_person.set(k);
            }
            for(int j=i+1;j<n;j++){
                BitSet temp=new BitSet(n);
                BitSet second_person=new BitSet(n);
                for(int k=0;k<topic[j].length();++k){
                    if(topic[j].charAt(k)=='1')
                        second_person.set(k);
                }
                temp.or(first_person);
                temp.or(second_person);
                cnt=temp.cardinality();
                if(cnt>mx){
                    mx=cnt;
                    count=1;
                }
                else if(cnt==mx){
                    count++;
                }
            }
        }
        System.out.println(mx);
        System.out.println(count);
    }
}

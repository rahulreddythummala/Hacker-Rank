import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int num_q=sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp=new HashMap<>();
        while(num_q-- > 0){
            String query=sc.nextLine();
            String[] words=query.split(" ");
            if(words[0].equals("add")){
                String word=words[1];
                for(int i=1;i<=word.length();++i){
                    String str=word.substring(0,i);
                    if(mp.get(str)==null)
                        mp.put(str,1);
                    else mp.put(str, mp.get(str)+1);
                }
            }
            else{
                String word=words[1];
                Integer freq=mp.get(word);
                if(freq==null) System.out.println("0");
                else System.out.println(freq);
            }
        }
    }    
}

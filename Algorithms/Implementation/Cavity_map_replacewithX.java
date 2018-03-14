import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        String up=grid[0];
        for(int i=1;i<n-1;++i){
            String curr=grid[i];
            String down=grid[i+1];
            char left=curr.charAt(0);
            for(int j=1;j<curr.length()-1;++j){
                char ch=curr.charAt(j);
                char right=curr.charAt(j+1);
                char uch=up.charAt(j);
                char dch=down.charAt(j);
                if(uch<ch && dch<ch && left<ch && right<ch){
                    grid[i]=grid[i].substring(0,j)+'X'+grid[i].substring(j+1);
                }
                left=ch;
            }
            up=curr;
        }
        for(String s: grid){
            System.out.println(s);
        }
    }
}

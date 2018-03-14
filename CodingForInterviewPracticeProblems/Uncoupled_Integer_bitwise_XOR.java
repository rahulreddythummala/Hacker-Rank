import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        String str=sc.nextLine();
        String[] nums=str.split(", ");
        for(String s : nums){
            b=b^Integer.valueOf(s);
        }
        System.out.println(b);
    }
}

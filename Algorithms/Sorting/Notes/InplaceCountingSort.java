// an exmaple of inplace or stable counting sort

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        StringBuilder array[] =new StringBuilder[100];
        for(int i=0; i<100 ;++i){
            array[i]=new StringBuilder();   // One hundered empty string builder objects
        }
        for(int i=0;i<n;++i){   // Read data for n inputs
            String str=sc.nextLine();
            String[] parts=str.split(" ");
            if(i<n/2)
                array[Integer.valueOf(parts[0])].append("- ");
            else
                array[Integer.valueOf(parts[0])].append(parts[1]+" ");
        }
        for(StringBuilder str: array)
            System.out.print(str.toString());
    }
}

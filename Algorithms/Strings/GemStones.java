import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // Counts the number of ones in a given interger value
    static int numOnes(int i){
        int count=0;
        while(i>0){
            i=i/2;
            ++count;
        }
        return count;
    }
    // Reads the characters from string and sets the corresponding bit
    static int getBitValue(String s){
        int s_val=0;
        for(int j=0;j<s.length();++j){
            s_val|=1<<(s.charAt(j)-'a');
        }
        return s_val;
    }
    
    static int gemstones(String[] arr){
        int value=0;
        for(int i=0;i<arr.length;++i){
            int bit_string=getBitValue(arr[i]);
            if(i==0){
                value|=bit_string;   // If it's the first string add all chars to Value(OR operation)
            }else{
                value&=bit_string;   // If it's any other string then & all char places
            }
        }
        return numOnes(value);  // Get the number of ones in your binary
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}

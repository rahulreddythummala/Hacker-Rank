import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int people=5;
        int liked=0;
        int total=0;
        while(days-- > 0){
            liked=people/2;
            total+=liked;
            people=liked*3;
        }
        System.out.println(total);
    }
}

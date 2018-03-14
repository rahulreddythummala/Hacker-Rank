import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public boolean isOpenType(char ch){
        return (ch=='{') || (ch=='[') || (ch=='(');
    }
    public boolean isPair(char ch1, char ch2){
        if((ch1=='[') && (ch2==']'))
            return true;
        if((ch1=='{') && (ch2=='}'))
            return true;
        if((ch1=='(') && (ch2==')'))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Solution sln=new Solution();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            if(sln.isValid(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public boolean isValid(String str){
        if(str==null) return true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(isOpenType(ch))
                st.push(ch);
            else{
                if(st.isEmpty())
                    return false;
                char tp=st.peek();
                if(!isPair(tp,ch))
                    return false;
                st.pop();
            }
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}

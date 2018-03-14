/*
 * Copyright (C) 2017 Anwar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package allanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anwar
 */
public class AllAnagrams {

    public static String[] friendlyWords(String[] input){
        if(input==null)
            return new String[]{};
        boolean[] isChecked=new boolean[input.length];
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<input.length-1;++i){
            if(isChecked[i])
                continue;
            ArrayList<String> rst=new ArrayList<>();
            rst.add(input[i]);
            isChecked[i]=true;
            boolean frndly=false;
            for(int j=i+1;j<input.length;++j){
                if(isChecked[j]) 
                    continue;
                if(input[i].length()==input[j].length()){
                    if(isAnagram(input[i],input[j])){
                        rst.add(input[j]);
                        frndly=true;
                        isChecked[j]=true;
                    }
                }
            }
            if(frndly){
                result.add(arrayToString(rst)); // All the invidual strings should be sorted ???
            }
        }
        String[] rst=result.toArray(new String[result.size()]);
        Arrays.sort(rst);   // All the concatenated strings should also be sorted ??
        return rst;
    }
    public static String arrayToString(ArrayList<String> rst){
        String[] result=rst.toArray(new String[rst.size()]);
        Arrays.sort(result, String::compareToIgnoreCase);
        String r="";
        for(String s: result)
            r+=(s+" ");
        return r;
    }
    
    public static boolean isAnagram(String str1, String str2){
        if(str1==null || str2==null)
            return false;
        if(str1.isEmpty() || str2.isEmpty())
            return false;
        int cnt[]=new int[26];
        for(int i=0;i<str1.length();++i){
            char ch=str1.charAt(i);
            if(!Character.isLetter(ch))
                return false;
            ch=Character.toLowerCase(ch);
            ++cnt[ch-'a'];
        }
        for(int i=0;i<str2.length();++i){
            char ch=str2.charAt(i);
            if(!Character.isLetter(ch))
                return false;
            ch=Character.toLowerCase(ch);
            --cnt[ch-'a'];
        }
        for(int i : cnt)
            if(i!=0)
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            String[] all_words=input.split(",");
            String[] result=friendlyWords(all_words);
            for(String s: result){
                System.out.println(s);
            }
        }
    }
}

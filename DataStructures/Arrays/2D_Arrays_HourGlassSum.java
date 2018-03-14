import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=0, cols=0;
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        while(sc.hasNext()){
            String line=sc.nextLine();
            String[] arr=line.split(" ");
            ArrayList<Integer> row_nums=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                row_nums.add(Integer.parseInt(arr[i]));
            }
            cols=row_nums.size();
            matrix.add(row_nums);
        }
        rows=matrix.size();
        int max_sum=-1000;
        for(int i=0;i<=cols-3;++i){
            for(int j=0;j<=rows-3;++j){
                int sum=get_sum(matrix, i,j);
                if(sum>max_sum)
                    max_sum=sum;
            }           
        }
        System.out.println(max_sum);
    }
    
    public static int get_sum(ArrayList<ArrayList<Integer>> matrix,
                              int i, int j){
        int sum=0;
        for(int a=i;a<i+3;a++){
           sum+=matrix.get(j).get(a);
        }
        j++;
        sum+=matrix.get(j).get(i+1);
        j++;
        for(int a=i;a<i+3;a++){
           sum+=matrix.get(j).get(a);
        }
        return sum;
    }
}

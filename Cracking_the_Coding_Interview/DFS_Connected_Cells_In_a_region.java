// The idea is to visit each neighbour and add 1 to the count if the neighbour is also '1'
// The above process is done recursively until the entire grid is explored.
// It doesn't matter from where we start the big conencted region could still be found
// So there is no need to reset the cells as false again.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean[][] visited;
    public static int[][] grid;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        grid = new int[n][m]; 
        visited=new boolean[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int bigRegion=-1;
        for(int row=0;row<grid.length;++row){
            for(int col=0;col<grid[0].length;col++){
                int size=0;
                if(!visited[row][col])
                    size=findRegion(row, col, grid.length, grid[0].length);
                bigRegion=Math.max(bigRegion, size);
            }
        }
        System.out.println(bigRegion);
    }
    public static int findRegion(int row, int col, int rowSize, int colSize){
        if(row>=rowSize || col>=colSize || row<0 || col<0){
            return 0;
        }
        if(visited[row][col]){
            return 0;
        }
        else{
            visited[row][col]=true;
        }       
        if(grid[row][col]==0){
            return 0;
        }
        int count=1;
        count+=findRegion(row+1,col, rowSize, colSize);
        count+=findRegion(row,col+1, rowSize, colSize);
        count+=findRegion(row+1,col+1, rowSize, colSize);
        count+=findRegion(row-1,col, rowSize, colSize);
        count+=findRegion(row,col-1, rowSize, colSize);
        count+=findRegion(row+1,col-1, rowSize, colSize);
        count+=findRegion(row-1,col+1, rowSize, colSize);
        return count;
    }
}

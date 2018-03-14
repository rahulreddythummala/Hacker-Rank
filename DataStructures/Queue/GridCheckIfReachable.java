import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Point{
    int x;
    int y;
    Point(){}
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class Solution {
    ArrayList<ArrayList<Character>> board;
    Point source, destination;
    int dim;
    public Solution(){
        board=new ArrayList<>();
        source=new Point();
        destination=new Point();
    }
    public void readBoard(){
        Scanner sc=new Scanner(System.in);
        dim=sc.nextInt();
        sc.nextLine();
        for(int row=0; row < dim; ++row){
            ArrayList<Character> rows=new ArrayList<>();
            String line=sc.nextLine();
            for(int col=0 ; col < dim; ++col){
                rows.add(line.charAt(col));
            }
            board.add(new ArrayList<>(rows));
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        source.x=x;
        source.y=y;
        x=sc.nextInt();
        y=sc.nextInt();
        destination.x=x;
        destination.y=y;
    }
    private ArrayList<Point> traversed=new ArrayList<>();
    public boolean Visited(int i, int j){
        if(traversed.size()==(dim*dim)) return true;
        for(Point p: traversed){
            if(p.x==i & p.y==j)
                return true;
        }
        return false;
    }
    private boolean destination_reached=false;
    private int moves=0;
    public void BFS(int i, int j, int prev_i, int prev_j){
//        System.out.printf("Called BFS with: i=%d, j=%d%n", i, j);
        if((i<0) || (j<0)) return;
        if((i>=dim) || (j>=dim)) return;
        if(Visited(i,j)) return;
        if(board.get(i).get(j)=='X') return;
        System.out.println("Visited("+i+","+j+") : "+board.get(i).get(j));
        traversed.add(new Point(i,j));
        if((i==destination.x) && (j==destination.y)){
//            System.out.println("Reached destination!");
            destination_reached=true;
            return;
        }
        BFS(i,j-1,i,j); // West
        BFS(i,j+1,i,j); // East
        BFS(i-1,j,i,j); // North
        BFS(i+1,j,i,j); // South
    }
    
    public int makeMove(){        
        BFS(source.x, source.y,source.x, source.y);
        if(destination_reached){
            System.out.println("Destination reached!");
            return moves+1;
        }
        System.out.println("Destination unreachable!");
        return -1;
    }
    
    public static void main(String[] args) {
        Solution sln=new Solution();
        sln.readBoard();
//        sln.printBoard();
        System.out.println(sln.makeMove());
    }
    
    
    
    public void printBoard(){
        for(ArrayList<Character> list: board){
            for(Character ch : list)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
    
    public void printSourceDestination(){
        System.out.println(source.x+ " "+ source.y);
        System.out.println(destination.x+ " "+ destination.y);
    }
    
}

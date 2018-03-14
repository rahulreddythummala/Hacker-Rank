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

    
    public int makeMove(){
        char mark='X';
        ArrayDeque<Integer> dist=new ArrayDeque<>();        // To store distances to far
        ArrayDeque<Point> q=new ArrayDeque<>();             // To store the points to be traversed
        q.addFirst(new Point(source.x, source.y));          // Add point to q
        board.get(source.x).set(source.y,mark);             // and mark it as 'X'
        dist.addFirst(0);                                   // Init distance = 0
        Point [] mv ={new Point(-1,0),new Point(0,1),new Point(1,0),new Point(0,-1)};   // North, east, south, west
        while(!q.isEmpty()){
            Point cur=q.peekLast();                             // Get the front point from q
            if(cur.x==destination.x && cur.y==destination.y){   // If this is destination                                                                 
                return dist.peekLast();                         // then return distance
            }
            for(Point p: mv){                                   // For each direction
                int nx = cur.x + p.x;                           // Get the co-ordinates
                int ny = cur.y+p.y;
                while(nx>=0 && ny>=0 && nx<dim && ny<dim &&     // As long as the new co-ords are valid
                      board.get(nx).get(ny)!=mark){
                    q.addFirst(new Point(nx, ny));              // Add the point to queue
                    dist.addFirst(dist.peekLast()+1);           // *** Append the distance(same value pre direction)
                    board.get(nx).set(ny,mark);                 // Mark the traversed
                    
                    nx+=p.x;                                    // *** continue in the same direction
                    ny+=p.y;
                    
                }
            }
            q.removeLast();                                     // After checking all the directions, remove the point
            dist.removeLast();                                  // and also remove the distance associated with it
        }
        return -1;
    }
    
    
    
    
    
    
    
    
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

    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Solution sln=new Solution();
        sln.readBoard();
//        sln.printBoard();
        System.out.println(sln.makeMove());
    }
}

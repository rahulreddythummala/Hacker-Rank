import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void findDistances(Graph g, int s){
        Node n=g.getNode(s);                        // Get the node that holds integer 's'
        LinkedList<Node> q=new LinkedList<>();          // Acts like queue
        TreeMap<Integer, Integer> dist=new TreeMap<>(); // To keep track of distance from 's'
        for(int i=1;i<=g.getSize();++i){
            dist.put(i,-1);                           // Let's put the initial distance to be '-1'
        }
        q.add(n);                                 // Add the node to the queue
        int distance=6;                           // Each edge distance is '6'
        while(!q.isEmpty()){                                // While there are unexplored children
            Node curr=q.removeFirst();                      // i;e dequeue
            for(Node child: curr.getChildren()){            // Get all children of current node
                if(!child.getState().equals("Visited")){    // If they are unexplored
                    q.add(child);                             // Add them to the queue
                    child.level=curr.level+1;                             // They are one level up from their parent
                    dist.put(child.getVal(), (child.level)*distance);     // Update the distance for that child
                    child.setState("Visited");                  // To avoid getting added again
                }
            }
            curr.setState("Visited");                         // Mark the node as visited
        }
        // Finally display the distances
        for(Map.Entry<Integer, Integer> e: dist.entrySet()){
            if(e.getKey()==s)   // If the node is the start node, then continue
                continue;
            System.out.print(e.getValue()+" ");
        }
        System.out.println();        
    }
    
    
    // Driver Program
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;++i){
            int n=sc.nextInt();
            Graph g=new Graph();
            for(int j=1;j<=n;++j){
                g.addNode(j);
            }
            int edges=sc.nextInt();
            for(int k=0;k<edges;++k){
                int u=sc.nextInt();
                int v=sc.nextInt();
                g.addEdge(u,v);
            }
            int s=sc.nextInt();
            findDistances(g,s);
        }
    }
}

class Graph{
    HashMap<Integer, Node> graphNodes;
    
    public Graph(){
        graphNodes=new HashMap<>();
    }
    public HashMap<Integer, Node> getNodes(){
        return new HashMap<>(graphNodes);
    }
    public void addEdge(int v, int u){
        Node n1=getNode(v);
        Node n2=getNode(u);
        n1.addChild(n2);
        n2.addChild(n1);
    }
    
    public void addNode(int val){
        Node n=new Node(val);
        this.graphNodes.put(val,n);
    }
    
    public Node getNode(int val){
        return graphNodes.get(val);
    }
    public int getSize(){
        return graphNodes.size();
    }
}



class Node{
    int val;
    ArrayList<Node> children;
    String state;
    public int level;
    public Node(){
        children=new ArrayList<>();
        state="Unvisited";
        level=0;
    }
    public int getVal(){
        return val;
    }
    
    public Node(int val){
       this();
        this.val=val;    
    }
    
    public ArrayList<Node> getChildren(){
        return new ArrayList<>(children);
    }
    
    public void addChild(Node n){
        this.children.add(n);
    }
    
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
}
///////////// END OF SOURCE FILE  ////////////////////

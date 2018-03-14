import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Trie{
    Node head=new Node('$');
    class Node{
        char ch;
        ArrayList<Node> children;
        Node(){
            ch='$';
            children=new ArrayList<>();
        }
        Node(char ch){
            children=new ArrayList<>();
            this.ch=ch;
        }
        public Node find(char ch){
            if(children.isEmpty()) return null;
            for(int i=0; i<children.size();++i){
                Node n=children.get(i);
                if(n.getChar()==ch)
                    return n;
            }
            return null;
        }
        public Node add(char ch){
            Node n=find(ch);
            if(n!=null) return n;
            n=new Node(ch);
            children.add(n);
            return n;
        }
        public ArrayList<Node> getChilds(){
            return new ArrayList<>(children);
        }
        public char getChar(){
            return this.ch;
        }
    }
    public void add(String word){
        if(word.isEmpty()) return;
        Node n=head.add(word.charAt(0));
        for(int i=1;i<word.length();++i){
            n=n.add(word.charAt(i));
        }
        n.add('*');
    }
    public void print(){
        this.print(head);
    }
    public void print(Node node){
        if(node==null) return;
        System.out.print(node.getChar()+" ");
        for(Node n: node.getChilds())
            print(n);
    }
    public int startsWith(String word){
        Node n=head;
        for(int i=0;i<word.length();++i){
            n=n.find(word.charAt(i));
            if(n==null) return 0;
        }
        //if(n.find('*')!=null) return 0;
        return leftOverWords(n);
    }
    public int leftOverWords(Node n){
        if(n==null) return 0;
        return findLength(n);
    }
    public int findLength(Node n){
        if(n==null) return 0;
        if(n.getChar()=='*')
            return 1;
        int total_len=0;
        for(Node ch: n.getChilds()){
            total_len+=findLength(ch);
        }
        return total_len;
    }
}
public class Solution {

    public static void main(String[] args) {
        Trie tr=new Trie();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        while(num-- > 0){
            String query=sc.nextLine();
            String[] q_words=query.split(" ");
            if(q_words[0].equals("add")){
                tr.add(q_words[1]);
            }
            else{
                System.out.println(tr.startsWith(q_words[1]));
            }
        }
    }
}

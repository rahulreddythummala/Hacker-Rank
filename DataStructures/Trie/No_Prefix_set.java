import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Trie{
    ArrayList<String> badSet=new ArrayList<>();
    Node head=new Node('$');
    class Node{
        char ch;
        ArrayList<Node> children;
        boolean bad=false;
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
        if(n.find('*')!=null){
                badSet.add(word);
        }
        for(int i=1;i<word.length();++i){
            if(n.find('*')!=null){
                badSet.add(word);
            }
            n=n.add(word.charAt(i));            
        }
        for(char ch='a';ch<='j';ch++){
            if(n.find(ch)!=null){
                badSet.add(word);
                return;
            }
        }
        if(n.find('*')!=null){
                badSet.add(word);
        }
        n.add('*');        
    }
    public ArrayList<String> badSets(){
        return this.badSet;
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
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num_q=sc.nextInt();
        sc.nextLine();
        Trie tr=new Trie();
        while(num_q-- > 0){
            String word=sc.nextLine();
            tr.add(word);
            if(tr.badSet.size()!=0)
                break;
        }
        for(String s: tr.badSets()){
            System.out.println("BAD SET");
            System.out.println(s);
            return;
        }
        System.out.println("GOOD SET");
    }
}

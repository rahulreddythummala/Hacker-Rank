 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {        
        Node prev=root;
        Node tmp=root;
        while(tmp!=null){
            prev=tmp;
            if(tmp.data < value)
                tmp=tmp.right;
            else tmp=tmp.left;
        }
        Node n=new Node();
        n.data=value;
        if(prev==null) return n;
        else if(prev.data > value) prev.left=n;
        else prev.right=n;
        return root;
    }



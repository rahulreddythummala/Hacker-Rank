   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       if(root==null) return;
       LinkedList<Node> dq=new LinkedList<>();
       dq.addLast(root);
       while(!dq.isEmpty()){
           Node n=dq.getFirst();
           dq.removeFirst();
           System.out.print(n.data+" ");
           if(n.left!=null)
               dq.addLast(n.left);
           if(n.right!=null)
               dq.addLast(n.right);
       }
    }

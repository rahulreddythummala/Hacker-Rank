   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
      if(root==null) return;
      leftSide(root.left);
      System.out.print(root.data+" ");
      rightSide(root.right);
    }
   void leftSide(Node node){
       if(node==null) return;
       leftSide(node.left);
       System.out.print(node.data+" ");
   }
   void rightSide(Node node){
       if(node==null) return;
       System.out.print(node.data+" ");
       rightSide(node.right);
   }

// The idea is to go to the extreme left and mark the last node as min
// and then go to the extreme right and mark the last node as max
// now each elements on the left of node must have a value which is in between the min and node.data
// now each elements on the right of node must have a value which is in between the node.data and max
// If the above two conditions are not satisfied then it's not a bst

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean isBST(Node node, int min, int max){
        if(node==null)
            return true;
        if(node.data<=min || node.data>=max){
            return false;
        }
        return isBST(node.left, min, node.data)
            & isBST(node.right, node.data, max);
    }

   boolean checkBST(Node root) {
       if(root==null) return true;
       Node tmp=root, pred=root;
       int max,min;
       while(tmp!=null){
           pred=tmp;
           tmp=tmp.right;
       }
       max=pred.data;
       tmp=root;
       while(tmp!=null){
           pred=tmp;
           tmp=tmp.left;
       }
       min=pred.data;
       return isBST(root, min-1,max+1);
   }

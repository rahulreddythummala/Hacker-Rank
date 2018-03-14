/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node node, int min, int max){
        if(node==null) return true;
        if(node.data >= max || node.data <= min)
            return false;
        return checkBST(node.left, min, node.data) 
            & checkBST(node.right, node.data, max);
    }
    boolean checkBST(Node root) {
        if(root==null) return true;
        int min, max;
        Node pred=root;
        for(Node n=root; n!=null; n=n.left){
            pred=n;
        }
        min=pred.data;
        for(Node n=root; n!=null; n=n.right){
            pred=n;
        }
        max=pred.data;
        return checkBST(root, min-1,max+1); // min<0<data<10^4<max
    }
/**
1. Find the minimum and maximum elements into the tree.
2. Now all the elements must be within this range.
3. Not only codition 2, but a node on left sub tree must be lower than it's parent and the greater than min element.
4. A node in right sub tree not be greater than max element and lower than parent data.
*/

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	if(root==null) return -1;
        int lh=height(root.left);
        int rh=height(root.right);
        return (lh > rh ? lh : rh)+1;
    }

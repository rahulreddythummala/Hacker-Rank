/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String s ,Node root)
    {
        Node tmp=root;
        for(int i=0;i<s.length();++i){
            int idx=s.charAt(i)-'0';
            if(idx==1)
                tmp=tmp.right;
            else tmp=tmp.left;            
            if(tmp.data!='\0'){
                System.out.print(tmp.data);
                tmp=root;
            }
        }          
    }

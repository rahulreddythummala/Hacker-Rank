/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    Node tmp1=headA;
    while(tmp1!=null){
        Node tmp2=headB;
        while(tmp2!=null){
            if(tmp1.data==tmp2.data)
                return tmp1.data;
            tmp2=tmp2.next;
        }
        tmp1=tmp1.next;
    }
    return 0;
}

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node n=new Node();
    n.data=data;
    n.next=null;
    if(head==null){
        head=n;
        return head;
    }
    Node pred=head, tmp=head.next;
    for(;tmp!=null;pred=pred.next, tmp=tmp.next);
    pred.next=n;
    return head;
}

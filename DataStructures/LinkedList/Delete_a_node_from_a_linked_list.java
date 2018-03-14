/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    if(head==null) return head;
    if(position==0){
        return head=head.next;
    }
    Node pred=head,tmp=head.next;
    while(position>1){
        position--;
        tmp=tmp.next;
        pred=pred.next;
    }
    pred.next=tmp.next;
    return head;
}

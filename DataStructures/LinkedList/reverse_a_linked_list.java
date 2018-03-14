/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head==null) return head;
    Node prev=null;
    Node next=null;
    while(head!=null){
        next=head.next;
        head.next=prev;
        prev=head;
        head=next;
    }
    head=prev;
    return head;
}

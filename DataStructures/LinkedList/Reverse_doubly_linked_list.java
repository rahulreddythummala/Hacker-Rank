/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
   Node tmp=head;
   Node tmp1=head;
   while(tmp!=null){
       Node prev=tmp.prev;
       tmp.prev=tmp.next;
       tmp.next=prev;
       tmp1=tmp;
       tmp=tmp.prev;
   }
    return tmp1;
}

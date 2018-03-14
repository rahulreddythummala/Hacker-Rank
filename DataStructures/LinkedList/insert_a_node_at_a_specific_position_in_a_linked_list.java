/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node n=new Node();
    n.data=data;
    n.next=null;
    if(head==null || position==0){
        n.next=head;
        return head=n;
    }
    Node tmp=head;
    while(position>1){
        position--;
        tmp=tmp.next;
    }
    n.next=tmp.next;
    tmp.next=n;
    return head;
}

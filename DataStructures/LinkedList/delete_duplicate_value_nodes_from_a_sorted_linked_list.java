/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    Node sptr=head;
    Node fptr=head.next;
    while(fptr!=null){
        if(sptr.data != fptr.data){
            sptr.next=fptr;
            sptr=sptr.next;
        }
        else sptr.next=null;
        fptr=fptr.next; 
    }
    return head;
}

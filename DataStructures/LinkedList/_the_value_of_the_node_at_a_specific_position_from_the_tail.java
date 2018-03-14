/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int size=0;
    for(Node tmp=head; tmp!=null;tmp=tmp.next, size++);
    size--;
    int pos=size-n;
    Node tmp;
    for(tmp=head;pos>0;pos--,tmp=tmp.next);
    return tmp.data;
}

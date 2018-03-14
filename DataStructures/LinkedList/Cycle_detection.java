/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null) return false;
    Node sptr=head;
    Node fptr=head;
    while(true){
        if(fptr==null) break;
            fptr=fptr.next;
        if(sptr==fptr)
            return true;
        if(sptr==null) break;
            sptr=sptr.next;
        if(fptr==null) break;
            fptr=fptr.next;
    }
    return false;
}

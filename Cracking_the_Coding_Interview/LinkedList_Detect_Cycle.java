// The idea is to keep two pointers, one slow and one fast
// If they both ever meet then there is a loop
// Else if either of them becomes null, then there is no loop

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node s_ptr=head;
    if(s_ptr==null) return false;
    Node f_ptr=head.next;
    while(s_ptr!=null){
        if(s_ptr==f_ptr)
            return true;
        if(f_ptr!=null)
            f_ptr=f_ptr.next;
        else
            return false;
        if(f_ptr!=null)
            f_ptr=f_ptr.next;
        else 
            return false;
        s_ptr=s_ptr.next;
    }
    return false;
}

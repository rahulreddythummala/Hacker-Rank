/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    if((headA==null) & (headB==null)) return headA;
    if(headA==null) return headB;
    if(headB==null) return headA;
    Node tmp1=headA, tmp2=headB;
    Node head=(headA.data < headB.data) ? headA : headB;
    Node tmp3=head;
    if(head==tmp1) tmp1=tmp1.next;
    else tmp2=tmp2.next;
    while((tmp1!=null) | (tmp2!=null)){
        if(tmp2==null){
            if(tmp3.data < tmp1.data){
               tmp3.next=tmp1;
               tmp1=tmp1.next;
               continue;
            }
        }
        else if(tmp1==null){
            if(tmp3.data < tmp2.data){
                tmp3.next=tmp2;
                tmp2=tmp2.next;
                continue;
            }
        }
        if(tmp1.data < tmp2.data){
            if(tmp1.data > tmp3.data){
                tmp3.next=tmp1;
                tmp1=tmp1.next;
            }
        }
        else{
            if(tmp2.data > tmp3.data){
                tmp3.next=tmp2;
                tmp2=tmp2.next;
            }
        }
        tmp3=tmp3.next;
    }
    return head;
} 

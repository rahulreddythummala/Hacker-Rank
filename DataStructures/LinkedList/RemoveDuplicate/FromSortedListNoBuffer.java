// The idea is to keep a pred pointer
// Both tmp and pred points to same position
// Update the pred pointer only if the tmp.next has a different value
// else we keep on changing pred.next
// Space O(1) , tmp, pred
// Time O(N)

Node RemoveDuplicates(Node head) {
    Node tmp=head;
    Node pred=head;
    while(tmp.next!=null){
        if(tmp.next.data==tmp.data){
            pred.next=tmp.next;
        }
        else pred=tmp;
        tmp=tmp.next;
    }
    return head;
}

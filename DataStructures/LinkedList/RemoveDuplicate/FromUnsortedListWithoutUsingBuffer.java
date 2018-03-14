// Space O(1)
// Time O(N^2)

Node RemoveDuplicates(Node head) {
    Node current=head;
    while(current!=null){
        Node runner=current;
        while(runner.next!=null){
            if(runner.next.data==current.data){
                runner.next=runner.next.next;
            }else{
                runner=runner.next;
            }
        }
        current=current.next;
    }
    return head;
}

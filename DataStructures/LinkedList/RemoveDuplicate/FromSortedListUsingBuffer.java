// Same as unsorted list using buffer

Node RemoveDuplicates(Node head) {
    HashSet<Integer> hs=new HashSet<>();
    Node tmp=head;
    while(tmp.next!=null){
        if(hs.contains(tmp.next.data)){
            tmp.next=tmp.next.next;
            
        }else{
            hs.add(tmp.next.data);
            tmp=tmp.next;
        }        
    }
    return head;
}

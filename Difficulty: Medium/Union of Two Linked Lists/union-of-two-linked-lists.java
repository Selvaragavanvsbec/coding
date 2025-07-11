/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        Node temp1=head1;
        Node temp2=head2;
              Set<Integer> set = new TreeSet<>();
        while(temp1!=null){
            set.add(temp1.data);
            temp1=temp1.next;
        }
          while(temp2!=null){
            set.add(temp2.data);
            temp2=temp2.next;
        }

        Node dummy=new Node(0);
        Node tail=dummy;
        for(int val:set){
            tail.next=new Node(val);
            tail=tail.next;
        }
        return dummy.next;
    }
}
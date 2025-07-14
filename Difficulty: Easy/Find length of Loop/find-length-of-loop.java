/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
                Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
           
            fast=fast.next.next;
            slow=slow.next;
             if(fast==slow){
                return findlength(slow,fast);
            }
                    }
 return 0;       
    }
public int findlength(Node slow,Node fast){
    int count=1;
    fast=fast.next;
    while(slow!=fast){
        count++;
        fast=fast.next;
    }
    return count;
}
}
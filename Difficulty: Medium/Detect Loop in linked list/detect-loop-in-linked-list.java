/* Node is defined as
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
           
            fast=fast.next.next;
            slow=slow.next;
             if(fast==slow){
                return true;
            }
                    }
 return false;       
    }
}
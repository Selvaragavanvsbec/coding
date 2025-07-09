/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
      if(head==null||head.next==null){
          return true;
      }
      //step1-->find middle
      Node slow=head;
      Node fast=head;
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      //step-2-->reverse second half
      Node secondhalf=reverse(slow);
      Node firsthalf=head;
      //step-3-->check both half
      while(secondhalf!=null){
          if(firsthalf.data!=secondhalf.data){
              return false;
          }
          firsthalf=firsthalf.next;
          secondhalf=secondhalf.next;
        
      }
      return true;
   
    }
       static Node reverse(Node head){
          Node prev=null;
          Node current=head;
          while(current!=null){
              Node front=current.next;
              current.next=prev;
              prev=current;
              current=front;
          }
          return prev;
      }
}
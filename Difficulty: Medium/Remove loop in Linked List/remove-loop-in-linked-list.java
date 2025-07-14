/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        Node start = findFirstNode(head);
        if (start == null) return;

        Node end = start;
      
        if (start == head) {
            while (end.next != start) {
                end = end.next;
            }
            end.next = null;
            return;
        }

    
        while (end.next != start) {
            end = end.next;
        }
        end.next = null;
    }

    public static Node findFirstNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}

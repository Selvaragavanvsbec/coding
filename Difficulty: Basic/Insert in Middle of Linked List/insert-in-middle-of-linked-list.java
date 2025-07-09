/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // If list has only one element
        if (head.next == null) {
            head.next = newNode;
            return head;
        }

        Node slow = head;
        Node fast = head;

        // Find middle using slow and fast pointer
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Insert new node after slow
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}


/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        if (head == null) return null;

        // Step 1: Insert cloned nodes next to original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Set random pointers for cloned nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the cloned list from the original list
        curr = head;
        Node dummy = new Node(0);
        Node copy = dummy;
        while (curr != null) {
            copy.next = curr.next;
            curr.next = curr.next.next;
            curr = curr.next;
            copy = copy.next;
        }

        return dummy.next;
    }
}

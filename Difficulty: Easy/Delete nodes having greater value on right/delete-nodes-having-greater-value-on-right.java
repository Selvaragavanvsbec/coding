class Solution {
    Node compute(Node head) {

        head = reverse(head);
        
        Node curr = head;
        int maxSoFar = head.data;
        Node prev = head;
        curr = curr.next;
        
        while (curr != null) {
            if (curr.data < maxSoFar) {
                prev.next = curr.next;
            } else {
                maxSoFar = curr.data;
                prev = curr;
            }
            curr = curr.next;
        }

        head = reverse(head);
        return head;
    }
    
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

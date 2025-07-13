class Solution {
    public static Node reverseKGroup(Node head, int k) {
        Node curr = head;
        int count = 0;

        // Count k nodes (or less at the end)
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // Reverse 'count' nodes, even if less than k
        curr = head;
        Node prev = null;
        Node next = null;

        for (int i = 0; i < count; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (curr != null) {
            head.next = reverseKGroup(curr, k);
        }

        return prev;
    }
}

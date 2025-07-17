class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }


        current.next = head;

   
        k = k % length;
        if (k == 0) {
            current.next = null;
            return head;
        }


        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}

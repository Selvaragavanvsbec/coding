
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;
        return dummy.next;
    }
}

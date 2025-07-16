class Solution {
    Node divide(Node head) {
        Node temp = head;
        Node oddstart = null;
        Node oddend = null;
        Node evenstart = null;
        Node evenend = null;
        
        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (oddstart == null) {
                    oddstart = temp;
                    oddend = temp;
                } else {
                    oddend.next = temp;
                    oddend = oddend.next;
                }
            } else {
                if (evenstart == null) {
                    evenstart = temp;
                    evenend = temp;
                } else {
                    evenend.next = temp;
                    evenend = evenend.next;
                }
            }
            temp = temp.next;
        }
        
        if (evenstart == null) return oddstart;
        if (oddstart == null) return evenstart;
        
        evenend.next = oddstart;
        oddend.next = null;
        return evenstart;
    }
}

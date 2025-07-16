class Solution {
    public Node removeDuplicates(Node head) {
        HashSet<Integer> myset = new HashSet<Integer>();
        Node temp = head;
        Node prev = null;
        
        while (temp != null) {
            if (myset.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                myset.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}

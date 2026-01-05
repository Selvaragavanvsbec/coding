class Solution {
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node a, Node b) {
         if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.data != b.data) return false;

        return (isIsomorphic(a.left, b.left) && isIsomorphic(a.right, b.right)) ||
               (isIsomorphic(a.left, b.right) && isIsomorphic(a.right, b.left));
}
}
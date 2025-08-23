/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList al=new ArrayList();
        in(root,al);
        return al;
    }
    public void in(Node root,ArrayList al){
        if(root==null){
            return;
        }
        in(root.left,al);
        al.add(root.data);
        in(root.right,al);
        
    }
}
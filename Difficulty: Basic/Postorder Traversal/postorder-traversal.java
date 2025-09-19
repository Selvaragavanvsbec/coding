/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> al=new ArrayList<>();
        post(root,al);
        return al;
    }
    public void post(Node root,ArrayList al){
        if(root==null){
            return ;
        }
        post(root.left,al);
        post(root.right,al);
        al.add(root.data);
    }
}
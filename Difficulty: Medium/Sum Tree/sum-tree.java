/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
       if(root==null){
           return true;
       }
       if (root.left == null && root.right == null)
    return true;

       int l=sum(root.left);
       int r=sum(root.right);
       if(root.data!=l+r){
           return false;
       }
       return isSumTree(root.left)&& isSumTree(root.right);
        
    }
    int sum(Node root){
        if(root==null){
            return 0;
        }
         return sum(root.left) + sum(root.right) + root.data;
    }
}
/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    
    }
    public boolean isMirror(Node a,Node b){
            if(a==null&&b==null){
            return true;
        }
        if(a==null||b==null){
            return false;
        }
        if(a.data!=b.data){
            return false;
        }
         return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
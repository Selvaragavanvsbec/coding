/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> al=new ArrayList<>();
        preorder(root,al);
        return al;
    }
    public void preorder(Node root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        al.add(root.data);
        preorder(root.left,al);
             preorder(root.right,al);   
    }
}
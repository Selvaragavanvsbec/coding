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
} */

class Solution {
    public int diameter(Node root) {
        // code here
        int[] dia=new int[1];
        int left=height1(root,dia);
           return dia[0];
    }
    public int height1(Node root,int[] dia){
        if(root==null){
            return 0;
        }
         int lh=height1(root.left,dia);
         int rh=height1(root.right,dia);
         dia[0]=Math.max(dia[0],lh+rh);
         return 1+Math.max(lh,rh);
    }
    
}
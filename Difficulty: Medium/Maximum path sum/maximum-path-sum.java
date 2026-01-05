/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
     int maxSum = Integer.MIN_VALUE;
    int findMaxSum(Node root) {
        // code here
        dfs(root);
        return maxSum;
    }
    int dfs(Node root){
        if(root==null){
            return 0;
        }
            int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));

        maxSum = Math.max(maxSum, root.data + left + right);

        return root.data + Math.max(left, right);
    }
}
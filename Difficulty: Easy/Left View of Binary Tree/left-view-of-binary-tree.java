/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return al;
        }
        q.add(root);
        while(!q.isEmpty()){
              int size=q.size();
        
          
            for(int i=1;i<=size;i++){
                    Node curr=q.poll();
               if(curr.left!=null){
                   q.add(curr.left);
               }
               if(curr.right!=null){
                   q.add(curr.right);
               }
               if(i==1){
                   al.add(curr.data);
               }
            }
        }
        return al;
    }
}
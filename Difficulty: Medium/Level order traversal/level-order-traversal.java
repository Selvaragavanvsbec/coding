/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
       Queue<Node> q=new LinkedList<>();
       ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    
       if(root==null){
           return al;
       }
          q.add(root);
          while(!q.isEmpty()){
             int num=q.size();
             ArrayList<Integer> sub=new ArrayList<>();
             for(int i=1;i<=num;i++){
                 if(q.peek().left!=null){
                     q.add(q.peek().left);
                 }
                  if(q.peek().right!=null){
                     q.add(q.peek().right);
                 }
                 sub.add(q.poll().data);
             }
             al.add(sub);
          }
          return al;
    }
}
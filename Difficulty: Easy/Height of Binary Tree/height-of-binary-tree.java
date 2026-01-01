/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null){
            return 0;
        }
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                  if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                q.poll();
            }
            count++;
        }
        return count-1;
    }
}
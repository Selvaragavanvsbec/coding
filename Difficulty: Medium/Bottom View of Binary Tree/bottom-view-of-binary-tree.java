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
    public ArrayList<Integer> bottomView(Node root) {
        // code here
          // code here
        TreeMap<Integer,Integer>map=new TreeMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        q.add(root);
        hdq.add(0);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int chdq=hdq.poll();
            map.put(chdq,curr.data);
            if(curr.left!=null){
                q.add(curr.left);
                hdq.add(chdq-1);
            }
             if(curr.right!=null){
                q.add(curr.right);
                hdq.add(chdq+1);
            }
        }
        for(Integer a:map.values()){
            al.add(a);
        }
        return al;
    }
}
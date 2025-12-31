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
    public ArrayList<Integer> topView(Node root) {
        // code here
        TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        q.add(root);
        hdq.add(0);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int chdq=hdq.poll();
            map.computeIfAbsent(chdq,k->new ArrayList<>()).add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
                hdq.add(chdq-1);
            }
             if(curr.right!=null){
                q.add(curr.right);
                hdq.add(chdq+1);
            }
        }
        for(ArrayList<Integer> a:map.values()){
            al.add(a.get(0));
        }
        return al;
    }
}
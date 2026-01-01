/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return al;
        }
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
        while(curr!=null){
           al.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
           curr=curr.right;
        }
        }
        return al;

    }
}
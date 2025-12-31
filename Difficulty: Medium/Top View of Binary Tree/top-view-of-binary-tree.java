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
         Queue<Integer> hd=new LinkedList<>();
         q.add(root);
         hd.add(0);
         while(!q.isEmpty()){
             Node curr=q.poll();
            int chd=hd.poll();
            map.computeIfAbsent(chd,k->new ArrayList<>()).add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
                hd.add(chd-1);
            }
             if(curr.right!=null){
                q.add(curr.right);
                hd.add(chd+1);
            }
         }
         for(ArrayList<Integer> val:map.values()){
             al.add(val.get(0));
         }
         return al;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
        Queue<Integer> hdq = new LinkedList<>();

        q.add(root);
        hdq.add(0);
        while(!q.isEmpty()){
            Node curnode=q.poll();
            int chdq=hdq.poll();
            map.computeIfAbsent(chdq,k->new ArrayList<>()).add(curnode.data);
            if(curnode.left!=null){
                q.add(curnode.left);
                hdq.add(chdq-1);
                
            }
              if(curnode.right!=null){
                q.add(curnode.right);
                hdq.add(chdq+1);
            }
            
            
        }
        for(ArrayList<Integer> val:map.values()){
            res.add(val);
        }
        return res;
    }
}

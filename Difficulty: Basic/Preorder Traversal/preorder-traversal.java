class Solution {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList al=new ArrayList();
        pre(root,al);
        return al;
     
        
    }
    public static void pre(Node root,ArrayList al){
           if(root==null){
            return;
        }
        al.add(root.data);
        pre(root.left,al);
        pre(root.right,al);
    }
}
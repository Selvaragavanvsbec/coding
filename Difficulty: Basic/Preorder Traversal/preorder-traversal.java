class Solution {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> al=new ArrayList<>();
    pre(al,root);
    return al;
    }
    public  void pre(ArrayList al,Node root){
            if(root==null){
            return;
        }
        al.add(root.data);
        pre(al,root.left);
        pre(al,root.right);
    }
}
/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
  
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        if(root==null){
            return al;
        }
        al.add(root.data);
        left_bry(root.left,al);
        print_leaf(root.left,al);
          print_leaf(root.right,al);
        right_bry(root.right,al,stack);
     while(!stack.isEmpty()){
                   al.add(stack.pop());
     }
  
        
        return al;
    }
    void left_bry(Node p,ArrayList<Integer> al){
        if(p!=null){
            if(p.left!=null){
                al.add(p.data);
                left_bry(p.left,al);
            }
            else if(p.right!=null){
                   al.add(p.data);
                left_bry(p.right,al);
            }
        }
    }
     void print_leaf(Node p,ArrayList<Integer> al){
        if(p!=null){
            if(p.left!=null){
                print_leaf(p.left,al);
            }
            if(p.left==null&&p.right==null){
               al.add(p.data);
            }
            print_leaf(p.right,al);
        }
    }
     void right_bry(Node p,ArrayList<Integer> al,Stack<Integer> stack){
          if(p!=null){
            if(p.right!=null){
                stack.push(p.data);
                right_bry(p.right,al,stack);
            }
            else if(p.left!=null){
                    stack.push(p.data);
            right_bry(p.left,al,stack);
            }
        }
    }
}
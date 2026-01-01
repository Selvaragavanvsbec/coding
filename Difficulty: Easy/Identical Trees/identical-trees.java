/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node T, Node S) {
        // code here
             if(T==null&&S==null){
            return true;
        }
        if(T==null||S==null){
            return false;
        }
        // add code he
       
         return T.data==S.data&& isIdentical(T.left,S.left)&&  isIdentical(T.right,S.right);
    
    }
}
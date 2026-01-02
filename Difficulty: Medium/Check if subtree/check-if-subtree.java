/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
       if(S==null){
           return true;
       }
       if(T==null){
           return false;
       }
       if(isSametree(T,S)){
           return true;
       }
      return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    public static boolean isSametree(Node T,Node S){
         if(T==null&&S==null){
            return true;
        }
        if(T==null||S==null){
            return false;
        }
        // add code he
       
         return T.data==S.data&& isSametree(T.left,S.left)&&isSametree(T.right,S.right);
    }
}
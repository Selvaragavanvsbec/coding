/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node temp=head;
        int cone=0;
        int ctwo=0;
        int czero=0;
        while(temp!=null){
            if(temp.data==0){
               czero++;
            }
            else if(temp.data==1){
                cone++;
            }
            else{
                ctwo++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(czero!=0){
                temp.data=0;
                czero--;
            }
            else if(cone!=0){
                temp.data=1;
                cone--;
            }
            else{
                temp.data=2;
                ctwo--;
            }
            temp=temp.next;
        }
        return head;
        
    }
}
// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        if(arr.length==1){
            return ;
        }
        int first=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=first;
    }
}
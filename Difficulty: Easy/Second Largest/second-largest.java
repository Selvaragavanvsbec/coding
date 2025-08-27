class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
         int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sl&&arr[i]!=l){
                sl=arr[i];
            }
        }
        return sl!=Integer.MIN_VALUE?sl:-1;
    }
}
class Solution {
    public void sort012(int[] arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[mid]==0){
                swap(low,mid,arr);
                low++;
                mid++;
            }
              else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,arr);
                high--;
            }
        }
        
    }
    public static void swap(int a,int b,int[] arr){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    }
}
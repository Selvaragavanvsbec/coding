class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
          quickSort(arr,p+1,high);   
        }
    }

    static int partition(int arr[], int low, int high) {
        
        // your code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high&&arr[i]<=pivot){
                i++;
            }
            while(j>=low&&arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}
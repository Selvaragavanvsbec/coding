// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
           if(k >= arr.length) {
            int maxBoard = 0;
            for(int i = 0; i < arr.length; i++) {
                maxBoard = Math.max(maxBoard, arr[i]);
            }
            return maxBoard;
        }
        return findPages(arr,k);
    }
    public static int findPages(int[] arr, int k) {
       
        // code here
        int min=-1;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=max+arr[i];
            if(arr[i]>min){
                min=arr[i];
            }
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int students=studentallocation(arr,mid);
            if(students>k){
               low=mid+1;
            }
            else if(students<=k){
               
                  high=mid-1;
            }
        }
        return low;
        //int j=0;
        // for(j=min;j<=min+max;j++){
        //     int students=studentallocation(arr,j);
        //     if(students<=k){
        //         return j;
        //     }
        // }
        // return j;
    }
    static int  studentallocation(int[] arr,int pages){
        int student=1;
        int actualpages=0;
        for(int i=0;i<arr.length;i++){
            if(actualpages+arr[i]<=pages){
                actualpages=actualpages+arr[i];
            }
            else{
                student++;
                actualpages=arr[i];
            }
        }
        return student;
    }
}

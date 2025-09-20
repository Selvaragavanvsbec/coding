/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.Arra
    Arrays.sort(arr);
    for(int i=0;i<arr.length-2;i++){
      
        int left=i+1;
        int right=arr.length-1;
        while(left<right){
            int target=arr[i]+arr[left]+arr[right];
            if(target==0){
                return true;
            }
            else if(target<0){
                left++;
            }
            else{
                right--;
            }
        }
        
    }
    return false;
        
    }
}
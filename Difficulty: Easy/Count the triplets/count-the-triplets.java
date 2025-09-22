class Solution {
    int countTriplet(int arr[]) {
        Arrays.sort(arr);
        int count=0;
  for(int i=arr.length-1;i>=2;i--){
      int left=0;
      int right=i-1;
      while(left<right){
          if(arr[left]+arr[right]==arr[i]){
              count++;
              left++;
              right--;
          }
          else if(arr[left]+arr[right]<arr[i]){
              left++;
          }
          else{
              right--;
          }
      }
  }
  return count;
    }
}
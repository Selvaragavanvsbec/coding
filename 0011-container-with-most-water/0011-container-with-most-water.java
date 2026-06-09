class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxi=0;
        int area=0;
        while(left<right){
            area=Math.min(arr[left],arr[right])*(right-left);
            maxi=Math.max(area,maxi);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}
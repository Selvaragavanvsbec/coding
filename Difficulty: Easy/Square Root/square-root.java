class Solution {
    int floorSqrt(int n) {
        // code here
        int result=binarysearch(1,n,n);
        return result;
    }
    int binarysearch(int low,int high,int n){
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
           
        }
        return high;
    }
}
class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max=Integer.MIN_VALUE;
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]>max){
                max=arr[i];
            }
            res[i-1]=max;
        }
        res[arr.length-1]=-1;
        return res;
    }
}
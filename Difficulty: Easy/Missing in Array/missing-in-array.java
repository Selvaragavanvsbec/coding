class Solution {
    int missingNum(int arr[]) {
        // code here
        if(arr.length==1&&arr[0]==1){
            return 2;
        }
        Arrays.sort(arr);
        int num=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==num+1){
                num=num+1;
            }
            else{
                return num+1;
            }
        }
        if(arr.length+1==arr[arr.length-1]){
            return arr[arr.length-1]-arr.length;
        }
        else if(arr.length+1!=arr[arr.length-1]){
            return arr.length+1;
    }
        return num-1;
    }
}
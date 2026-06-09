class Solution {
    public int candy(int[] arr) {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
    //   if(left[0]>left[1]){
    //     left[0]=2;
    //   }
    //   else{
    //     left[1]=1;
    //   }
    //     for(int i=1;i<arr.length;i++){
    //         if(left[i]>left[i-1]){
    //             left[i]=left[i-1]+1;
    //         }
    //         else{
    //             left[i]=1;
    //         }
    //     }
    //       if(right[arr.length-1]>right[arr.length-2]){
    //     right[arr.length-1]=2;
    //   }
    //   else{
    //     right[arr.length-1]=1;
    //   }
    //      for(int i=arr.length-2;i>=1;i--){
    //         if(right[i]>right[i+1]){
    //             right[i]=right[i-1]+1;
    //         }
    //         else{
    //             right[i]=1;
    //         }
    //     }
 
    for(int i=0;i<left.length;i++){
        left[i]=1;
        right[i]=1;
    }
    for(int i=1;i<left.length;i++){
if(arr[i]>arr[i-1]){
left[i]=left[i-1]+1;
}
    }

       for(int i=right.length-2;i>=0;i--){
if(arr[i]>arr[i+1]){
right[i]=right[i+1]+1;
}
    }
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=Math.max(left[i],right[i]);
        }
        return count;
    }
}
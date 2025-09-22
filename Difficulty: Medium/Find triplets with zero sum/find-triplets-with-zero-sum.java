/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int sum=-(arr[i]+arr[j]);
                if(set.contains(sum)){
                    return true;
                }
                set.add(arr[j]);
            }
        }
return false;
        
    }
}
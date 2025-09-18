class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        if(arr.length<3){
            return false;
        }
     
        for(int i=0;i<arr.length-1;i++){
               HashMap<Integer,Integer> mymap=new HashMap<>();
            for(int j=i+1;j<arr.length;j++){
            int sum=target-(arr[i]+arr[j]);
            
            if(mymap.containsKey(sum)){
                return true;
            }
        mymap.put(arr[j],j);
            
            }
        }
return false;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int element=nums[0];
        for(int i=1;i<nums.length;i++){
            if(element==nums[i]){
                count++;
            }
            else {
                count--;
            }
            if(count==0){
                element=nums[i+1];
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(element==nums[i]){
                count++;
            }
            if(count>(nums.length/2)){
                return element;
            }
        }
 return -1;       
    }
}
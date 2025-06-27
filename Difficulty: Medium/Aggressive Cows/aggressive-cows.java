// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int maxvalid=0;
        for(int i=1;i<=stalls[stalls.length-1]-stalls[0];i++){
           boolean check= checkcows(stalls,i,k);
            if(check){
                maxvalid = i;
                continue;
            }
            else{
              break; 
            }
        }
        return maxvalid;
    }
   static boolean checkcows(int[] arr,int dist,int cows){
    int countcows=1;
    int last=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[last]>=dist){
                countcows++;
                last=i;
            }
        }
        if(countcows>=cows){
            return true;
        }
        return false;
    }
}
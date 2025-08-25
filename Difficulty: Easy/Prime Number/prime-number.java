class Solution {
    static boolean isPrime(int n) {
        if(n==1||n==2){
            return false;
        }
        // code here
     for(int i=2;i*i<=n;i++){
         if(n%i==0){
             return false;
         }
     } 
     return true;
    }
}
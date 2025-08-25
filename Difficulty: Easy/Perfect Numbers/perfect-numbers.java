class Solution {
    static boolean isPerfect(int n) {
        // code here
        if(n==1){
            return false;
        }
        int num=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                num+=i;
                if(i!=n/i){
                 num+=n/i;
            }
            }
            
        }
        boolean flag=num==n?true:false;
        return flag;
        
    }
};
class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
        int rem=0;
        int check=0;
        while(temp>0){
            rem=temp%10;
            check=(check*10)+rem;
            temp=temp/10;
        }
        boolean isFlag=(check==n)?true:false;
        return isFlag;
        
    }
}
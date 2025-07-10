// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        double result=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            result=result+Math.pow(digit,3);
            temp=temp/10;
        }
        if(n==result){
            return true;
        }
       return false;
    }
}
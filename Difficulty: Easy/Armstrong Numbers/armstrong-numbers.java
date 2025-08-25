// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
    int temp=n;
    int rem=0;
    int sum=0;
    while(temp>0){
        rem=temp%10;
        sum+=(rem*rem*rem);
        temp=temp/10;
    }
    boolean flag=sum==n?true:false;
    return flag;
    }
}
// User function Template for Java

class Solution {
    static int getLastDigit(String a, String b) {
        // code here
        int num1=a.charAt(a.length()-1)-'0';
        int num2=b.length()>=2?Integer.parseInt(b.substring(b.length()-2)):Integer.parseInt(b);
        if(num2==0){
            return 1;
        }
        if(num2%4==0){
            num2=4;
        }
        else{
            num2=num2%4;
        }
        int ans=1;
for(int i=0;i<num2;i++){
    ans=ans*num1;
}
        return ans%10;
    }
};
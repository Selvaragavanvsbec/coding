// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'0';
            if(ch!=0&&n%ch==0){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public static int gcd(int a, int b) {
        // code here
        int rem=1;
        while(rem!=0){
            rem=a%b;
            if(rem!=0){
                a=b;
                b=rem;
            }
        }
        return b;
    }
}

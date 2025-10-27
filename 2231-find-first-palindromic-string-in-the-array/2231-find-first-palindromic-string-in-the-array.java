class Solution {
    public String firstPalindrome(String[] words) {
        String fpallindrome="";
        for(int i=0;i<words.length;i++){
           boolean isvalid= check(words[i]);
           if(isvalid){
            return words[i];
           }
        }


      return fpallindrome;  
    }
    public boolean check(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
if(s.charAt(left)!=s.charAt(right)){
    return false;
}
left++;
right--;
        }
        return true;
    }
}
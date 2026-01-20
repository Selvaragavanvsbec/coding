class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String[] arr = s.split("\\s+");
       String s2="";
       for(int i=arr.length-1;i>=0;i--){
s2=s2+arr[i]+" ";

       }
       return s2.trim();
    }
}
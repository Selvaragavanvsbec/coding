class Solution {
    public int lengthOfLongestSubstring(String s) {
       // HashSet<String> set=new HashSet<>();
        String max="";
        for(int i=0;i<s.length();i++){
            String temp="";
            for(int j=i;j<s.length();j++){
                if(!temp.contains(s.charAt(j)+"")){
                    temp+=s.charAt(j);
                   
                }
                else{
                   
                    break;
                }

       }
       if(temp.length()>max.length()){
        max=temp;
       }
    
        }
           return max.length();
    }
}
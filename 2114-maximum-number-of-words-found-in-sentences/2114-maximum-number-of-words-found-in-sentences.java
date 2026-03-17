class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            String s1=s[i];
            int len=s1.length();
            s1=s1.replaceAll(" ","");
            len=len-s1.length();
            if(len>max){
                max=len;
                len=0;
            } 
            else{
                len=0;
            }
        }
        return max+1;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       

         List<List<String>> al=new ArrayList<>();
         boolean[] already=new boolean[strs.length];
         for(int i=0;i<strs.length;i++){
            if(already[i]==true){
                continue;
            }
            List<String> batch=new ArrayList<>();
            batch.add(strs[i]);
            int[] arr1=new int[26];
             
         
                already[i]=true;
                for(int k=0;k<strs[i].length();k++){
arr1[strs[i].charAt(k)-'a']+=1;
                }
            

            for(int j=i+1;j<strs.length;j++){
                if(already[j]==true){
                continue;
            }
int[] arr2=new int[26];
for(int l=0;l<strs[j].length();l++){
  arr2[strs[j].charAt(l)-'a']+=1;  
}
for(int z=0;z<arr2.length;z++){
    if(arr1[z]!=arr2[z]){
    break;
}
else if(arr1[z]==arr2[z]&&z==arr1.length-1){
    batch.add(strs[j]);
    already[j]=true;
}
}

            }
            al.add(batch);
 
         }
         return al;
    }
}
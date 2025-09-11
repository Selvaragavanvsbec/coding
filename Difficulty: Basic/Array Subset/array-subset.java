
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<a.length;j++){
     map.put(a[j],map.get(a[j])==null?1:map.get(a[j])+1);
        }
        for(int i=0;i<b.length;i++){
            if(map.get(b[i])!=null&& map.get(b[i]) > 0){
                map.put(b[i],map.get(b[i])-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public List<Integer> findLonely(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           int num=entry.getKey();
           int freq=entry.getValue();
           if(freq>=2||(map.containsKey(num-1)||map.containsKey(num+1))){
            continue;
           }
           else{
            al.add(num);
           }
        }
return al;
    }
}
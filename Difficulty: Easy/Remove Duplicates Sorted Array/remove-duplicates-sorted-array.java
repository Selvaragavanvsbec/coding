class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int ele=arr[0];
        ArrayList<Integer> al=new ArrayList<>();
                al.add(ele);
for(int i=1;i<arr.length;i++){
    if(arr[i]!=ele){
        al.add(arr[i]);
        ele=arr[i];
    }
}
return al;
    }
}

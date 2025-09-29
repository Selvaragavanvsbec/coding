class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        return (a.length+b.length)-set.size();
    }
}
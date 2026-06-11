class Solution {
    public int equalPairs(int[][] mat) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<mat[0].length;j++){
             sb.append(mat[i][j]).append(".");
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        int count=0;
             for(int i=0;i<mat.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<mat[0].length;j++){
                       sb.append(mat[j][i]).append(".");
            }
            count+=map.getOrDefault(sb.toString(),0);
        }
        
        return count;
    }
}
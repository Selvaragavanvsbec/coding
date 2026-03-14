import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }

        HashMap<String,String> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            String key = pattern.charAt(i) + "";

            if(!map.containsKey(key)){
                if(map.containsValue(arr[i])){ 
                    return false;
                }
                map.put(key, arr[i]);
            }
        }

        for(int i = 0; i < arr.length; i++){
            String s1 = map.get(pattern.charAt(i) + "");
            if(!s1.equals(arr[i])){
                return false;
            }
        }

        return true;
    }
}
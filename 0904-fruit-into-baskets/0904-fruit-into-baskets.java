class Solution {
public int totalFruit(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int left = 0;
    int max = 0;

    for (int right = 0; right < arr.length; right++) {

        map.put(arr[right],
                map.getOrDefault(arr[right], 0) + 1);

        while (map.size() > 2) {

            int count = map.get(arr[left]);

            if (count == 1) {
                map.remove(arr[left]);
            } else {
                map.put(arr[left], count - 1);
            }

            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}
}
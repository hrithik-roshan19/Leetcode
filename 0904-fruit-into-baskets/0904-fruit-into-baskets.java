class Solution {
    public int totalFruit(int[] fruits) {
          HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int ans = -1;
        int k=2;

        while (high < fruits.length) {

            int key = fruits[high];

            map.put(key, map.getOrDefault(key, 0) + 1);

            while (map.size() > k) {

                int leftkey = fruits[low];

                map.put(leftkey, map.get(leftkey) - 1);

                if (map.get(leftkey) == 0) {
                    map.remove(leftkey);
                }

                low++;
            }

            if (map.size() <= k) {
                ans = Math.max(ans, high - low + 1);
            }

            high++;
        }

        return ans;
        
    }
}
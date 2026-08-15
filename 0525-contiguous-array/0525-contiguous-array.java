class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefix = 0;
        int maxLen = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                prefix--;
            } else {
                prefix++;
            }

            if (map.containsKey(prefix)) {

                int len = i - map.get(prefix);
                maxLen = Math.max(maxLen, len);

            } else {
                map.put(prefix, i);
            }
        }

        return maxLen;
    }
}
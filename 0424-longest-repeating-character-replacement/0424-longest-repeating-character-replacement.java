class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int ans = -1;
        int maxFreq = 0;

        while (high < s.length()) {

            char ch = s.charAt(high);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ( (high-low+1)-(maxFreq) > k) {

                char leftChar = s.charAt(low);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;
            }

           ans = Math.max(ans, high - low + 1);

            high++;
        }

        return ans;
    }
}
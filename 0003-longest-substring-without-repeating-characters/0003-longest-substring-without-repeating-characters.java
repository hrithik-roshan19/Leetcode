class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int ans = 0;
        

        while (high < s.length()) {

            char ch = s.charAt(high);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {

                char leftChar = s.charAt(low);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;
            }

                ans=Math.max(ans,high-low+1);
            high++;
        }

        return ans;
        
    }
}
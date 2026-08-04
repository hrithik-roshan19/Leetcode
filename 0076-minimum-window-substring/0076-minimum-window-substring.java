class Solution {
    public String minWindow(String s, String t) {
         if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int low = 0;
        int high = 0;

        int formed = 0;
        int required = need.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (high < s.length()) {

            char ch = s.charAt(high);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) &&
                window.get(ch).intValue() == need.get(ch).intValue()) {

                formed++;
            }

            while (formed == required) {

                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char left = s.charAt(low);

                window.put(left, window.get(left) - 1);

                if (need.containsKey(left) &&
                    window.get(left) < need.get(left)) {

                    formed--;
                }

                low++;
            }

            high++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];

        int i = 1;
        int j = 0;

        while (i < combined.length()) {

            if (combined.charAt(i) == combined.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } 
            else if (j > 0) {
                j = lps[j - 1];
            } 
            else {
                i++;
            }
        }

        int palindromeLength = lps[combined.length() - 1];

        String remaining = s.substring(palindromeLength);

        return new StringBuilder(remaining)
                .reverse()
                .toString() + s;
    }
}
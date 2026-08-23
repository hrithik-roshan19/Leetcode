class Solution {

    class Pair {
        char chr;
        int cnt;

        Pair(char chr, int cnt) {
            this.chr = chr;
            this.cnt = cnt;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty() && st.peek().chr == ch) {
                st.peek().cnt++;
            } else {
                st.push(new Pair(ch, 1));
            }

            if (st.peek().cnt == k) {
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            Pair p = st.pop();

            while (p.cnt-- > 0) {
                sb.append(p.chr);
            }
        }

        return sb.reverse().toString();
    }
}
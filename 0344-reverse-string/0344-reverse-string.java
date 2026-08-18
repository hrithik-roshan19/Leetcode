class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
}

// class Solution {
//     public void reverseString(char[] s) {
//         Stack<Character> st = new Stack<>();

//         // Push all characters
//         for (char ch : s) {
//             st.push(ch);
//         }

//         // Pop and put back
//         for (int i = 0; i < s.length; i++) {
//             s[i] = st.pop();
//         }
//     }
// }
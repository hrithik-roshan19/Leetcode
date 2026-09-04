class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0;
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        while(start<s.length()){
            char ch= s.charAt(start);
            if(map.get(ch)==1){
                return start;
            }
            start ++;
        }
        return -1;
    }
}
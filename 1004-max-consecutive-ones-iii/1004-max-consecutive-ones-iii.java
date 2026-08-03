class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = Integer.MIN_VALUE;
        int zeroCount=0;

        while (high < nums.length) {

            if(nums[high]==0){
                zeroCount++;
            }

            while ( zeroCount > k) {
                if(nums[low]==0){
                    zeroCount--;
                }

                low++;
            }

           ans = Math.max(ans, high - low + 1);

            high++;
        }

        return ans;
    }
}
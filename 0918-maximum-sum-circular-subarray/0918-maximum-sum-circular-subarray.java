class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=nums[0];
        int minsum=nums[0];
        int ans1=nums[0];
        int ans2=nums[0];
        int ans=nums[0];

        int sum = Arrays.stream(nums).sum();

        for(int i=1; i<nums.length; i++){
            maxsum=Math.max(nums[i],maxsum+nums[i]);
            ans1=Math.max(ans1,maxsum);

            minsum=Math.min(nums[i],minsum+nums[i]);
            ans2=Math.min(ans2,minsum);

        }
        if (ans1 < 0) {
            return ans1;
        }

        int s= sum-ans2;

        return ans=Math.max(ans1,s);
    }
}    

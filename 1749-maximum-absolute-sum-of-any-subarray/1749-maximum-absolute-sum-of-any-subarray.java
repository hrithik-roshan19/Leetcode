class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans1=nums[0];
        int ans2=nums[0];
        int ans= Math.abs(nums[0]);
        int minsum=nums[0];
        int maxsum=nums[0];

        for(int i=1; i<nums.length; i++){
            maxsum=Math.max(nums[i],maxsum+nums[i]);
            ans1=Math.max(ans1,maxsum);

            minsum=Math.min(nums[i],minsum+nums[i]);
            ans2=Math.min(minsum,ans2);

            int ans3=Math.abs(ans1);
            int ans4=Math.abs(ans2);

            ans=Math.max(ans3,ans4);
        }
        return ans;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int current=0, officer=0;
        while(current<nums.length){
            if(nums[current]!=0){
                int temp= nums[current];
                nums[current]=nums[officer];
                nums[officer]=temp;
                officer++;
                current++;
            }
            else{
                current++;
            }
        }
    }
}
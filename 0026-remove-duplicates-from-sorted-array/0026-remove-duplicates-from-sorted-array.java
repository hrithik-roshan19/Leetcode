class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0, cm=1;
        if (nums.length == 0) {
                return 0;
            
        }
        else{
            while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            }
            nums[officer + 1] = nums[cm];
            officer ++;
            cm++;
            }
        }
        return officer+1;
    }
}
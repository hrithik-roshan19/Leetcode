class Solution {
    public int removeElement(int[] nums, int val) {

        int officer = 0;

        for (int current = 0; current < nums.length; current++) {

            if (nums[current] != val) {
                nums[officer] = nums[current];
                officer++;
            }
        }

        return officer;
    }
}

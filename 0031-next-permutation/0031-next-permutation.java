class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // Step 1: Find pivot
        int pivot = n - 2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        // Step 2: Find element just greater than pivot
        if (pivot >= 0) {

            int right = n - 1;

            while (nums[right] <= nums[pivot]) {
                right--;
            }

            swap(nums, pivot, right);
        }

        // Step 3: Reverse the right part
        reverse(nums, pivot + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
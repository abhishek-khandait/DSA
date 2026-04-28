class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index1 = -1;

        // Step 1: find breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }

        // Step 2: if found, find next greater
        if (index1 != -1) {
            for (int j = n - 1; j > index1; j--) {
                if (nums[j] > nums[index1]) {
                    swap(nums, j, index1);
                    break;
                }
            }
        }

        // Step 3: reverse the suffix
        reverse(nums, index1 + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
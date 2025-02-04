class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0, sum = nums[0]; // Initialize sum with first element
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i]; // Continue summing in ascending order
            } else {
                max = Math.max(max, sum); // Update max if needed
                sum = nums[i]; // Reset sum to the current number
            }
        }
        return Math.max(max, sum); // Ensure last sequence is considered
    }
}

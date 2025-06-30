import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        if (total % 2 != 0) return false; // Odd sum can't be split equally

        int target = total / 2;
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return subsetSum(n - 1, target, nums, dp);
    }

    private boolean subsetSum(int i, int target, int[] nums, int[][] dp) {
        if (target == 0) return true;
        if (i == 0) return nums[0] == target;

        if (dp[i][target] != -1)
            return dp[i][target] == 1;

        boolean notPick = subsetSum(i - 1, target, nums, dp);
        boolean pick = false;

        if (nums[i] <= target)
            pick = subsetSum(i - 1, target - nums[i], nums, dp);

        dp[i][target] = (pick || notPick) ? 1 : 0;
        return pick || notPick;
    }
}

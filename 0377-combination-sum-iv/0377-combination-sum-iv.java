
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[]dp = new int[target + 1];
        Arrays.fill(dp, -1);
        return helper(nums, target, dp);
    }
    public int helper(int[]nums, int target, int[]dp){

        if(target < 0)return 0;
        if(dp[target] != -1)return dp[target];
        if(target == 0)return 1;

        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count += helper(nums, target - nums[i], dp);
        }
        dp[target] = count;
        return count;
    }
}
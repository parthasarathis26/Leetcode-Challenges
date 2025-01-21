class Solution {
    public int solve(int i,int nums[],int dp[]){
        int n=nums.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=nums[i]+Math.max(solve(i+2,nums,dp),solve(i+3,nums,dp));
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(solve(0,nums,dp),solve(1,nums,dp));
    }
}
class Solution {
    public int solve(int i,int j,int n1,int n2,int num1[],int num2[],int dp[][]){
        if(i>=n1||j>=n2){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(num1[i]==num2[j]){
            return dp[i][j]=1+solve(i+1,j+1,n1,n2,num1,num2,dp);
        }
        return dp[i][j]=Math.max(solve(i+1,j,n1,n2,num1,num2,dp),solve(i,j+1,n1,n2,num1,num2,dp));

    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int dp[][]=new int[n1][n2];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        return solve(0,0,n1,n2,nums1,nums2,dp);
    }
}
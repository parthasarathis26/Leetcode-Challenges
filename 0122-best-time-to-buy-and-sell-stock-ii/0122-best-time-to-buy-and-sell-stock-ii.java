class Solution {
    int f(int i,int buy,int dp[][],int prices[],int n){
        if(i==n) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int  profit=0;
        if(buy==1){
            profit=Math.max(-prices[i]+f(i+1,0,dp,prices,n),f(i+1,1,dp,prices,n));
        }
        else{
            profit=Math.max(prices[i]+f(i+1,1,dp,prices,n),f(i+1,0,dp,prices,n));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return f(0,1,dp,prices,n);
    }
}
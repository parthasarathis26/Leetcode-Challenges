class Solution {
    public int rec(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=rec(n-1,dp)+rec(n-2,dp)+rec(n-3,dp);
        return dp[n];
    }
    public int tribonacci(int n) {
        // if(n==0||n==1){
        //     return n;
        // }
        // if(n==2){
        //     return 1;
        // }
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n,dp);
    }
}
import java.util.Arrays;

class Solution {
    int f(int i, int buy, int t, int[][][] dp, int[] prices, int n) {
        if (i == n || t == 0) return 0;  
        if (dp[i][buy][t] != -1) return dp[i][buy][t];
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[i] + f(i + 1, 0, t, dp, prices, n),
                               f(i + 1, 1, t, dp, prices, n));
        } else {
            profit = Math.max(prices[i] + f(i + 1, 1, t - 1, dp, prices, n), 
                               f(i + 1, 0, t, dp, prices, n));
        }

        return dp[i][buy][t] = profit;
    }

    public int maxProfit(int k,int[] prices) {
        int n = prices.length;
        if(n==0||k==0) return 0;

         if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }
        int[][][] dp = new int[n][2][k+1];
        for (int[][] mat : dp)
            for (int[] row : mat)
                Arrays.fill(row, -1);

        return f(0, 1, k, dp, prices, n); 
    }
}

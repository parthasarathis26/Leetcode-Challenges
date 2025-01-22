class Solution {
    public int solve(int i,int j,int m,int n,int dp[][],int ob[][]){
        if(i>=m||j>=n){
            return 0;
        }
        if(ob[i][j]==1){
            return 0;
        }
        if(i==m-1&&j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=solve(i+1,j,m,n,dp,ob)+solve(i,j+1,m,n,dp,ob);
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0,0,m,n,dp,obstacleGrid);
    }
}
class Solution {
    private final int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    private int m, n;
    private int[][] memo, matrix;
    
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        m = matrix.length;
        n = matrix[0].length;
        memo = new int[m][n];
        
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(i, j));
            }
        }
        return ans;
    }
    
    private int dfs(int i, int j) {
        if (memo[i][j] != 0) return memo[i][j];
        
        int maxLen = 1;
        for (int[] d : dirs) {
            int x = i + d[0], y = j + d[1];
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                maxLen = Math.max(maxLen, 1 + dfs(x, y));
            }
        }
        
        return memo[i][j] = maxLen;
    }
}
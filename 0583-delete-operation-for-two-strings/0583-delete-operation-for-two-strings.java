class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int lcs=f(m-1,n-1,dp,word1,word2);
        return m+n-2*lcs;
    }
    int f(int i,int j,int dp[][],String word1,String word2){
        if(i<0||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = 1 + f(i - 1, j - 1,dp, word1, word2);
        } else {
            // Try skipping one character from either string
            return dp[i][j] = Math.max(
                f(i - 1, j,dp, word1, word2),
                f(i, j - 1,dp, word1, word2)
            );
        }
    }
}
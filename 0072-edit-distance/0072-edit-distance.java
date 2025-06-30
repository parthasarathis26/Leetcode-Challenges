import java.util.Arrays;

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(m - 1, n - 1, word1, word2, dp);
    }

    private int helper(int i, int j, String word1, String word2, int[][] dp) {
        if (i < 0) return j + 1; // insert all remaining characters of word2
        if (j < 0) return i + 1; // delete all remaining characters of word1

        if (dp[i][j] != -1) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            // Characters match → move to next
            return dp[i][j] = helper(i - 1, j - 1, word1, word2, dp);
        } else {
            // Try all 3 operations: insert, delete, replace
            int insert = 1 + helper(i, j - 1, word1, word2, dp);    // insert into word1
            int delete = 1 + helper(i - 1, j, word1, word2, dp);    // delete from word1
            int replace = 1 + helper(i - 1, j - 1, word1, word2, dp); // replace in word1

            dp[i][j] = Math.min(insert, Math.min(delete, replace));
            return dp[i][j];
        }
    }
}

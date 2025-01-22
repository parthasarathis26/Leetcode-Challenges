class Solution {
    bool f(string &s1, string &s2, int i, int j, int len, vector<vector<vector<int>>> &dp)
    {
        if (len == 1) return s1[i] == s2[j];
        if (dp[i][j][len] != -1) return dp[i][j][len];
        bool ans = false;
        for (int k = 1; k < len; ++k)
        {
            if (f(s1, s2, i, j, k, dp) && f(s1, s2, i + k, j + k, len - k, dp))
            {
                ans = true;
                break;
            }
            if (f(s1, s2, i + k, j, len - k, dp) && f(s1, s2, i, j + len - k, k, dp))
            {
                ans = true;
                break;
            }
        }
        return dp[i][j][len] = ans;
    }
public:
    bool isScramble(string s1, string s2) {
        vector<string> v;
        int m = s1.size();
        vector<vector<vector<int>>> dp(m, vector<vector<int>>(m, vector<int>(m + 1, -1)));
        return f(s1, s2, 0, 0, m, dp);        
    }
};
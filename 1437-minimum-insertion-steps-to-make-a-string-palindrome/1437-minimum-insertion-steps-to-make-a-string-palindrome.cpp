class Solution {
public:
    int mi(int i,int j,string &s,vector<vector<int>> &dp){
        if(i>j||i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s[i]==s[j]){
            return dp[i][j]=mi(i+1,j-1,s,dp);
        }
        return dp[i][j]=1+min(mi(i+1,j,s,dp),mi(i,j-1,s,dp));
    }
    int minInsertions(string s) {
        int n=s.size();
        vector<vector<int>> dp(n,vector<int>(n,-1));
        return mi(0,n-1,s,dp);
    }
};
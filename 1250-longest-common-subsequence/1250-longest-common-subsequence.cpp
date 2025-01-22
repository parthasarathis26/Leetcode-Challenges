class Solution {
public:
    int lcs(int i,int j,string &t1,string &t2,vector<vector<int>> &dp){
        int n1=t1.size();
        int n2=t2.size();
        if(i>=n1||j>=n2){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(t1[i]==t2[j]){
            return dp[i][j]=1+lcs(i+1,j+1,t1,t2,dp);
        }
        return dp[i][j]=max(lcs(i+1,j,t1,t2,dp),lcs(i,j+1,t1,t2,dp));
    }
    int longestCommonSubsequence(string text1, string text2) {
        int n1=text1.size();
        int n2=text2.size();
        vector<vector<int>> dp(n1,vector<int>(n2,-1));
        return lcs(0,0,text1,text2,dp);
    }
};
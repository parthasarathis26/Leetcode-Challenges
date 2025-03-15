class Solution {
public:
    void backtrack(int start,vector<vector<int>> &res,vector<int>&curr,vector<int>& nums){
        res.push_back(curr);
        for (int i = start; i < nums.size(); i++) {
            curr.push_back(nums[i]);
            backtrack(i + 1, res, curr, nums);
            curr.pop_back();
        }
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int>curr;
        backtrack(0,res,curr,nums);
        return res;
    }
};
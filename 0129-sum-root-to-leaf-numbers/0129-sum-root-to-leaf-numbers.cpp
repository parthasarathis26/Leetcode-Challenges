/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sum(TreeNode* root,int c){
        if(root==NULL){
            return 0;
        }
        c=c*10+root->val;
        if (!root->left && !root->right) {
            return c;
        }
        int l=sum(root->left,c);
        int r=sum(root->right,c);
        return l+r;
    }
    int sumNumbers(TreeNode* root) {
        int ans=sum(root,0);
        return ans;
    }
};
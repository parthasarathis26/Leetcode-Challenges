/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0,height=0;
    public int findBottomLeftValue(TreeNode root) {
        findans(root,1);
        return ans;

    }
    public void findans(TreeNode root,int depth){
        if(height<depth){
            ans=root.val;
            height=depth;
        }
        if(root.left!=null) findans(root.left,depth+1);
        if(root.right!=null) findans(root.right,depth+1);
    }
}
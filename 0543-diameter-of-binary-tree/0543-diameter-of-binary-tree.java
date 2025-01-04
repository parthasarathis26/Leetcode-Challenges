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
    int maxw=0;
    public int root(TreeNode temp){
        if(temp==null){
            return 0;
        }
        int lp=root(temp.left);
        int rp=root(temp.right);
        maxw=Math.max(maxw,lp+rp);
        return 1+Math.max(lp,rp);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode temp=root;
        int h1;
        root(temp);
        return maxw;
    }
}
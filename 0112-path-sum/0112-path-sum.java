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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkSum(root, targetSum, 0);
    }

    public boolean checkSum(TreeNode root, int target, int sum){
        if (root==null) return false;
        sum += root.val;
        if (root.left == null && root.right == null && sum == target) return true;
        return checkSum(root.left, target, sum) || checkSum(root.right, target, sum);
    }
}
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        inorder(root, out);
        return out;
    }

    public  void inorder(TreeNode root, List<Integer> out){
        if (root == null) return;
        inorder(root.left,out);
        out.add(root.val);
        inorder(root.right, out);
    }
}
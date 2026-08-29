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
        boolean check = true;
    public boolean isBalanced(TreeNode root) {
         height(root);
         return check;
    }

    public int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int right = height(node.right);
        int left = height(node.left);

        if (Math.abs(left - right) > 1) 
        check = false;

        return 1 + Math.max(left , right);
    }
}
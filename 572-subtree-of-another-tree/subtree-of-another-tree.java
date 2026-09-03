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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null) {
            return false;
        }

        if(sameTree(root , subRoot)) {
            return true;
        }else if (isSubtree(root.left , subRoot)) {
            return true;
        }else if(isSubtree(root.right , subRoot)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean sameTree(TreeNode first , TreeNode second) {
        if(first == null && second == null) {
            return true;
        }

        if(first == null || second == null) {
            return false;
        }
        if(first.val != second.val) {
            return false;
        }

        return sameTree(first.left , second.left) && sameTree(first.right , second.right);
    }
}
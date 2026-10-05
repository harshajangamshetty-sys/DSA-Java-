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
    HashMap<Integer, Integer> map = new HashMap();
    int[] preOrder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder = preorder;

        //remember where the root exists in the inOrder
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode build(int preStart, int preEnd, int inStart, int inEnd) {

        if (preStart > preEnd)
            return null;

        int rootVal = preOrder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int index = map.get(rootVal);
        int leftSize = index - inStart;

        root.left = build(preStart + 1, preStart + leftSize, inStart, index - 1);
        root.right = build(preStart + leftSize + 1, preEnd, index + 1, inEnd);

        return root;
    }
}
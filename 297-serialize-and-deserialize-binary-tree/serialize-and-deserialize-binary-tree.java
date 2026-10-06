/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
        StringBuilder ser = new StringBuilder();
        int pos;
        String [] split;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ser = new StringBuilder();
        buildString(root);
        return ser.toString();
    }
    public void buildString(TreeNode node) {
        if(node == null) {
            ser.append("#,");
            return;
        }

        ser.append(node.val +",");
        buildString(node.left);
        buildString(node.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         split = data.split(",");
        pos = 0;
        return buildTree(split[pos]); 
    }
    public TreeNode buildTree(String str) {
        if(str.equals("#")) {
            return null;
        }
        int token = Integer.parseInt(str);
        TreeNode root = new TreeNode(token);
        pos++;
        root.left = buildTree(split[pos]);
        pos++;
        root.right = buildTree(split[pos]);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
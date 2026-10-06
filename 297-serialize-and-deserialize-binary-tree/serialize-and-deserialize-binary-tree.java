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

    StringBuilder builder;
    int pos;
    String [] split;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        builder = new StringBuilder ();
        buildString(root);
        return builder.toString();
    }

    public void buildString(TreeNode node) {
        if(node == null) {
            builder.append("#,");
            return;
        }
        builder.append(node.val + ",");

        buildString(node.left);
        buildString(node.right);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        split = data.split(",");
        pos = 0;
        return buildTree();
    }

    public TreeNode buildTree() {
        String str = split[pos];
        
        if(str.equals("#")) {
            return null;
        }

        int token = Integer.parseInt(str);
        TreeNode root = new TreeNode(token);

        pos++;
        root.left = buildTree();
        pos++;
        root.right = buildTree();

        return root;
    } 
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
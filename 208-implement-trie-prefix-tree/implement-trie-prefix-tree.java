class Trie {
    private TreeNode root;

    public Trie() {
        root = new TreeNode ();
    }
    
    public void insert(String word) {
        TreeNode cur = root;
        for(char c : word.toCharArray()) {
            int i = c - 'a';
            if(cur.children[i] == null) {
                cur.children[i] = new TreeNode();
            }
            cur = cur.children[i];
        }
        cur.endOfWord = true;
    }
    
    public boolean search(String word) {
        TreeNode cur = root;
        for(char c : word.toCharArray()) {
            int i = c - 'a';
            if(cur.children[i] == null) {
                return false;
            }
            cur = cur.children[i];
        }
            return cur.endOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode cur = root;
        for(char c : prefix.toCharArray()) {
            int i = c - 'a';
            if(cur.children[i] == null) {
                return false;
            }
            cur = cur.children[i];
        }
        return true;
    }
}

public class TreeNode {
    TreeNode [] children = new TreeNode[26];
    boolean endOfWord = false;
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
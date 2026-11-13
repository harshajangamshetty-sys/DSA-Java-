class Trie {

    TreeNode root;

    public Trie() {
        root = new TreeNode();
    }
    
    public void insert(String word) {
        TreeNode cur = root;
        for(char c : word.toCharArray()) {
            if(cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TreeNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }
    
    public boolean search(String word) {
        TreeNode cur = root;
        for(char c : word.toCharArray()) {
            if(cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        return cur.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode cur = root;
        for(char c : prefix.toCharArray()) {
            if(cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        return true;
    }
}

class TreeNode {
    TreeNode [] children;
    boolean isWord;

    public TreeNode () {
        children = new TreeNode [26];
        isWord = false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
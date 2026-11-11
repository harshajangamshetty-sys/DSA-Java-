class WordDictionary {

    TreeNode root;

    public WordDictionary() {
        root = new TreeNode(); 
    }
    
    public void addWord(String word) {
        TreeNode cur = root;
        for(char c : word.toCharArray()) {
            if(cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TreeNode ();
            }
            cur = cur.children[c - 'a'];
        }
        cur.word = true;
    }
    
    public boolean search(String word) {
        return dfs(word , 0 , root);
    }

    public boolean dfs(String word , int j , TreeNode root) {
        TreeNode cur = root;
        for(int i = j; i < word.length(); i ++) {
            char c = word.charAt(i);
            if(c == '.') {
                for(TreeNode child : cur.children) {
                    if(child != null && dfs(word , i + 1 , child)) {
                        return true;
                    }
                }
                return false;
            }else {
                if(cur.children[c - 'a'] == null) {
                    return false;
                }
                cur = cur.children[c - 'a'];
            }
        }
        return cur.word;
    }
}

class TreeNode {
    TreeNode [] children;
    boolean word;

    public TreeNode () {
        children = new TreeNode [26];
        word = false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
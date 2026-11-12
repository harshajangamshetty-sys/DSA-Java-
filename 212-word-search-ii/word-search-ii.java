class Solution {
    boolean [][] visit;
    Set<String> res;
    public List<String> findWords(char[][] board, String[] words) {
        TreeNode root = new TreeNode();
        for(String word : words) {
            root.addWord(word);
        }
        res = new HashSet<>();
        visit = new boolean [board.length][board[0].length];

        for(int r = 0; r < board.length; r ++) {
            for(int c = 0; c < board[0].length; c ++) {
                dfs(board , "" , r , c , root);
            }
        }
        return new ArrayList<>(res);
    }
        
        
        public void  dfs(char [][] board , String word , int i , int j , TreeNode node) {
            if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || visit[i][j] || !node.children.containsKey(board[i][j])) {
                return;
            }

            visit[i][j] = true;
            word += board[i][j];
            node = node.children.get(board[i][j]);
            if(node.isWord) {
                res.add(word);
            }

            dfs(board , word , i + 1 , j , node);
            dfs(board , word , i - 1 , j , node);
            dfs(board , word , i , j + 1 , node);
            dfs(board , word , i , j - 1 , node);

            visit[i][j] = false;
        }
}

class TreeNode {
    Map<Character , TreeNode> children;
    boolean isWord;

    public TreeNode () {
        children = new HashMap<>();
        isWord = false;
    }

    public void addWord(String word) {
        TreeNode cur = this;
        for(char c : word.toCharArray()) {
            cur.children.putIfAbsent(c , new TreeNode());
            cur = cur.children.get(c);
        }
        cur.isWord = true;
    }
}
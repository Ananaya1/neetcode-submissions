class PrefixTree {
    // Each node contains an array pointing to potential child nodes (a-z)
    private PrefixTree[] children;
    // Flags whether this specific node marks the end of a complete word
    private boolean isEnd;

    public PrefixTree() {
        this.children = new PrefixTree[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        PrefixTree node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Convert character to 0-25 index
            if (node.children[index] == null) {
                node.children[index] = new PrefixTree();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        PrefixTree node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEnd; // Must be a complete word
    }

    public boolean startsWith(String prefix) {
        PrefixTree node = this;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true; // The prefix exists in the tree
    }
}
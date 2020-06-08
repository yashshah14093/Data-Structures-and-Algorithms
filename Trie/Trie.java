class Trie {
    Map<Character,Trie> child;
    boolean end;
    /** Initialize your data structure here. */
    public Trie() {
        child = new HashMap<>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie curr = this;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            Trie node = curr.child.get(c);
            if(node == null){
                node = new Trie();
                curr.child.put(c,node);
            }
            curr = node;
        }
        curr.end = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie curr = this;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            Trie node = curr.child.get(c);
            if(node == null)
                return false;
            curr = node;
        }
        return curr.end;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            Trie node = curr.child.get(c);
            if(node == null)
                return false;
            curr = node;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
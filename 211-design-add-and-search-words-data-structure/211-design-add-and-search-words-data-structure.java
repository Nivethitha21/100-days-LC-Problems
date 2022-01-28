class WordDictionary {
    private static class Node {
        char c; 
        Map<Character, Node> children; 
        boolean isWord = false;
        public Node(char c) {
            this.c = c; 
            this.children = new HashMap<>();
        }
    }
    
    Node root = new Node('\0');
    
    public WordDictionary() {
    }
    
    public void addWord(String word) {
        Node curr = root; 
        for(char c : word.toCharArray()) {
            curr.children.putIfAbsent(c, new Node(c)); 
            
            curr = curr.children.get(c);
        }
        
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        return search(word, 0, root);
    }
    
    private boolean search(String word, int at, Node node) {
        if (at == word.length()) return node != null && node.isWord;
        if (node == null) return false;
        
        if (word.charAt(at) == '.') {
            for(char child : node.children.keySet()) {
                if (search(word, at+1, node.children.get(child))) return true;
            }
        } else {
            char c = word.charAt(at);
            
            if (node.children.containsKey(c)) 
                return search(word, at + 1, node.children.get(c));
        }
        
        return false;
    }
}

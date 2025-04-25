package com.param.dsa.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trie {

    private TrieNode root;

    /** Initialize the Trie */
    public Trie() {
        root = new TrieNode();  // Root node doesn't hold any character but serves as the starting point
    }

    /** Inserts a word into the Trie */
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {  // Iterate over each character in the word
            int index = c - 'a';  // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();  // Create a new node if it doesn't exist
            }
            node = node.children[index];  // Move to the child node
        }
        node.isEndOfWord = true;  // After inserting all characters, mark the end of the word
    }


    /** Returns true if the word exists in the Trie */
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {  // Iterate over each character
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;  // If any character is missing, word doesn't exist
            }
            node = node.children[index];
        }
        return node.isEndOfWord;  // Only return true if it's marked as the end of a word
    }

    /** Returns true if there is any word in the Trie that starts with the given prefix */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {  // Iterate over each character in the prefix
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;  // If any character is missing, prefix doesn't exist
            }
            node = node.children[index];
        }
        return true;  // Successfully found the prefix path
    }

    // Node class representing each character node in the Trie
    class TrieNode {
        TrieNode[] children;  // Array to hold references to child nodes (26 for lowercase letters)
        boolean isEndOfWord;  // Flag to indicate if this node marks the end of a complete word

        public TrieNode() {
            children = new TrieNode[26];  // Initialize all children to null
            isEndOfWord = false;          // Initially, no word ends at this node
        }
    }

    // Autocomplete: Find all words starting with a given prefix
    public List<String> autocomplete(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode node = root;

        // Step 1: Find the node corresponding to the last char in prefix
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return results;  // No words with this prefix
            }
            node = node.children[index];
        }

        // Step 2: DFS from the found node to collect all words
        dfs(node, prefix, results);
        return results;
    }

    // Helper method: DFS traversal to collect words
    private void dfs(TrieNode node, String prefix, List<String> results) {
        if (node.isEndOfWord) {
            results.add(prefix);  // Found a word
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';
            if (node.children[index] != null) {
                dfs(node.children[index], prefix + c, results);  // Continue exploring
            }
        }
    }


    // Driver code to test the Trie
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apex");
        trie.insert("bat");
        trie.insert("ball");

        System.out.println(trie.autocomplete("ap"));  // [apple, app, apex]
        System.out.println(trie.autocomplete("ba"));  // [bat, ball]
        System.out.println(trie.autocomplete("cat")); // []
    }
}

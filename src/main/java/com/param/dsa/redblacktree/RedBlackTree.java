package com.param.dsa.redblacktree;

public class RedBlackTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        int key;
        Node left, right, parent;
        boolean color;

        Node(int key) {
            this.key = key;
            this.color = RED;  // New nodes are always RED initially
        }
    }

    private Node root;

    // Left rotate around node x
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    // Right rotate around node y
    private void rightRotate(Node y) {
        Node x = y.left;
        y.left = x.right;
        if (x.right != null) x.right.parent = y;
        x.parent = y.parent;
        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;
        x.right = y;
        y.parent = x;
    }

    // Insert a new key
    public void insert(int key) {
        Node node = new Node(key);
        Node y = null;
        Node x = root;

        while (x != null) {
            y = x;
            if (node.key < x.key) x = x.left;
            else x = x.right;
        }

        node.parent = y;
        if (y == null) root = node;
        else if (node.key < y.key) y.left = node;
        else y.right = node;

        insertFixup(node);
    }

    // Fix the Red-Black Tree properties after insertion
    private void insertFixup(Node z) {
        while (z.parent != null && z.parent.color == RED) {
            if (z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right; // uncle
                if (y != null && y.color == RED) {
                    // Case 1: uncle is RED
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) {
                        // Case 2: z is right child
                        z = z.parent;
                        leftRotate(z);
                    }
                    // Case 3: z is left child
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    rightRotate(z.parent.parent);
                }
            } else {
                Node y = z.parent.parent.left; // uncle
                if (y != null && y.color == RED) {
                    // Case 1: uncle is RED
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) {
                        // Case 2: z is left child
                        z = z.parent;
                        rightRotate(z);
                    }
                    // Case 3: z is right child
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.color = BLACK; // Root must always be black
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.key + (node.color == RED ? "R " : "B "));
            inorderHelper(node.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] keys = {10, 20, 30, 15, 25, 5};

        for (int key : keys) {
            tree.insert(key);
        }

        tree.inorderTraversal(); // Outputs the tree in sorted order with color info
    }

}

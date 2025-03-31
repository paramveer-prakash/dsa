package com.param.dsa.tree;

public class AVLTree {
    static class Node{
        int key,height;
        Node left,right;

        Node(int d){
            key = d;
            height=1;
        }
    }

    private Node root;

    public void insert(int key){
        root = insert(root,key);
    }


    //in order traversal
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    //helper methods

    private void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.key+" ");
            inOrder(node.right);
        }
    }

    private Node insert(Node node, int key){
        //Normal BST insert
        if(node == null){
            return new Node(key);
        }

        if(key<node.key)
            node.left=insert(node.left, key);
        else if (key > node.key)
            node.right=insert(node.right,key);
        else
            return node; // Duplicate keys not allowed

        //update height
        node.height=1+Math.max(height(node.left),height(node.right));

        //get balance factor
        int balance = getBalance(node);

        //perofrm rotations if unbalanced

        //left left case
        if(balance > 1 && key < node.left.key){
            return rightRotate(node);
        }

        // right right case
        if(balance<-1 && key > node.right.key){
            return leftRotate(node);
        }

        //left right case
        if(balance>1 && key > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        //right left case
        if(balance<-1 && key < node.right.key){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        //return unchanged node
        return node;
    }

    private int height(Node node){
        return node==null ? 0:node.height;
    }

    private int getBalance(Node node){
        return node==null ?0:height(node.left)-height(node.right);
    }

    private Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //Rotation
        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left),height(y.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;

        //return new root
        return x;
    }

    public Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Rotation
        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height = Math.max(height(y.left),height(y.right))+1;

        return y;

    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int [] keys = {10,20,30,40,50,25};

        for(int key:keys){
            tree.insert(key);
        }

        System.out.println("In order traversal: ");

        tree.inOrder();
    }
}

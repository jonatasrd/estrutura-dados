package com.arvore;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key) {
        if (this.root == null) {
            this.root = new Node(key);
        } else {
            this.insertNode(this.root, key);
        }
    }

    private void insertNode(Node node, int key) {
        if (key < node.getKey()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(key));
            } else {
                this.insertNode(node.getLeft(), key);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(key));
            } else {
                this.insertNode(node.getRight(), key);
            }
        }
    }

    public void inOrderTraverse() {
        this.inOrderTraverseNode(this.root);
    }

    public void preOrderTraverse() {
        this.preOrderTraverseNode(this.root);
    }

    public void postOrderTraverse() {
        this.postOrderTraverseNode(this.root);
    }

    private void inOrderTraverseNode(Node node) {
        if (node != null) {
            this.inOrderTraverseNode(node.getLeft());
            System.out.println("Nó: " + node.getKey());
            this.inOrderTraverseNode(node.getRight());
        }
    }

    private void preOrderTraverseNode(Node node) {
        if (node != null) {
            System.out.println("Nó: " + node.getKey());
            this.preOrderTraverseNode(node.getLeft());
            this.preOrderTraverseNode(node.getRight());
        }
    }

    private void postOrderTraverseNode(Node node) {
        if (node != null) {
            this.postOrderTraverseNode(node.getLeft());
            this.postOrderTraverseNode(node.getRight());
            System.out.println("Nó: " + node.getKey());
        }
    }

    public Node min() {
        return this.minNode(this.root);
    }

    private Node minNode(Node node) {
        Node current = node;

        while (current != null && current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    public Node max() {
        return this.maxNode(this.root);
    }

    private Node maxNode(Node node) {
        Node current = node;
        while (current != null && current.getRight() != null) {
            current = current.getRight();
        }
        return current;
    }

    public boolean search(int key) {
        return this.searchNode(this.root, key);
    }

    private boolean searchNode(Node node, int key) {
        if (node == null)
            return false;

        if (key < node.getKey()) {
            return this.searchNode(node.getLeft(), key);
        } else if (key > node.getKey()) {
            return this.searchNode(node.getRight(), key);
        } else {
            return true;
        }
    }

    public void remove(int key) {
        this.root = this.removeNode(this.root, key);
    }

    private Node removeNode(Node node, int key) {
        if (node == null) return null;

        if (key < node.getKey()) {
            node.setLeft(this.removeNode(node.getLeft(), key));
            return node;
        } else if (key > node.getKey()) {
            node.setRight(this.removeNode(node.getRight(), key));
        } else {
            if (node.getLeft() == null && node.getRight() == null) {
                node = null;
                return node;
            }
            if (node.getLeft() == null) {
                node = node.getRight();
                return node;
            } else if (node.getRight() == null) {
                node = node.getLeft();
                return node;
            }
            Node aux = this.minNode(node.getRight());
            node.setKey(aux.getKey());
            node.setRight(this.removeNode(node.getRight(), aux.getKey()));
            return node;
        }
        return node;
    }

}

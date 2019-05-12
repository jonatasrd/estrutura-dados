package com.arvore;

public class BinarySearchTreeTest {
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(11);
		tree.insert(7);
		tree.insert(15);
		tree.insert(5);
		tree.insert(3);
		tree.insert(9);
		tree.insert(8);
		tree.insert(10);
		tree.insert(13);
		tree.insert(12);
		tree.insert(14);
		tree.insert(20);
		tree.insert(18);
		tree.insert(25);
		tree.insert(6);
		
		System.out.println("Navegação em ordem");
		tree.inOrderTraverse();
		
		System.out.println("Navegação pré ordem");
		tree.preOrderTraverse();
		
		System.out.println("Navegação pós ordem");
		tree.postOrderTraverse();
		
		System.out.println("Valor mínimo da arvore é: " + tree.min().getKey());
		System.out.println("Valor máximo da arvore é: " + tree.max().getKey());
		
		System.out.println(tree.search(1) ? "Key 1 found." : "Key 1 not found.");
		System.out.println(tree.search(8) ? "Key 8 found." : "Key 8 not found.");
		
	}
}

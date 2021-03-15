package com.ds.tree;

public class app {
	
	public static void main(String[] args) {
		
		Node r = new Node(10);
		Node n = new Node(20);
		Node x = new Node(50);
		Node s = new Node(40);
		BinaryTree tree = new BinaryTree(r);
		
		tree.add(r, tree.rot);
		tree.add(n, tree.rot);
		tree.add(x, tree.rot);
		tree.add(s, tree.rot);
		
		tree.LevelTraversal(tree.rot);
		
	}

}

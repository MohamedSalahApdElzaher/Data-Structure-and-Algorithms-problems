package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node rot;
    // constructor
	public BinaryTree(Node root) {
		this.rot = root;
	}
	
	// add
	public void add(Node newNode , Node root) {
		if(root == null) root = newNode;
		if(newNode.key > root.key) {
			if(root.right == null)root.right = newNode;
			else add(newNode , root.right);
		}
		if(newNode.key < root.key) {
			if(root.left == null)root.left = newNode;
			else add(newNode , root.left);
		}
		
	}
	
	// left -> root -> right
	public void InOrderTraversal(Node root){
		if(root == null)return;
		InOrderTraversal(root.left);
		System.out.println(root.key);
		InOrderTraversal(root.right);
	}
	
	// root -> left -> right
	public void PreOrderTraversal(Node root) {
		if (root == null) return;
		System.out.println(root.key);
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
	}
	
	//  left -> right -> root
	public void PostOrderTraversal(Node root) {
		if (root == null) return;
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
		System.out.println(root.key);
	}
	
	// visit level by level from left nodes to right nodes
	Queue <Node> q = new LinkedList<>();
	public void LevelTraversal(Node root){
		  if (root == null) return;
	        q.add(root);
	        while(!q.isEmpty()) {
	            Node n = q.poll();
	            System.out.print(n.key+" ");
	            if(n.left != null)q.add(n.left);
	             if(n.right != null)q.add(n.right);
	        }
	}
	
	
	
	// height
	public int Height(Node root) {
		if (root == null)return 0;
		return 1 + Math.max(Height(root.left), Height(root.right));
	}
	
	// size
	public int Size(Node root) {
		if (root == null)return 0;
		return 1 + Size(root.left) + Size(root.right);
	}

}

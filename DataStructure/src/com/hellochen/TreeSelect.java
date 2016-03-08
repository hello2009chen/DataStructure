package com.hellochen;

public class TreeSelect {
	
	private Node root;

	public static void main(String[] args) {
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 24, 56, 35, 25, 89 };
		TreeSelect tree = new TreeSelect();
		for (int i = 0; i < arrays.length; i++) {
			tree.buildTree(tree.root, arrays[i]);
		}
		
		tree.preOrder(tree.root);
		tree.inOrder(tree.root);
		//tree.posOrder(tree.root);
	}
	
	private class Node {
		
		private Node root;
		
		private Node leftNode;
		
		private Node rightNode;
		
		private int data;
		
		public Node (int data) {
			this.leftNode = null;
			this.rightNode = null;
			this.data=data; 
		}
	}	
	 
	 public void buildTree(Node node, int data) {
			if (root == null) {
				root = new Node(data);
			} else {
				if (data < node.data) {
					if (node.leftNode == null) {
						node.leftNode = new Node(data);
					} else {
						buildTree(node.leftNode, data);
					}
				} else {
					if (node.rightNode == null) {
						node.rightNode = new Node(data);
					} else {
						buildTree(node.rightNode, data);
					}
				}
			}
		}
		
		public void preOrder(Node node) {
			if (node != null) {
				System.out.print(node.data+"\t");
				preOrder(node.leftNode);
				preOrder(node.rightNode);
			}
		}
		
		public void inOrder(Node node) {
			if (node != null) {
				inOrder(node.leftNode);
				System.out.print(node.data+"\t");
				inOrder(node.rightNode);
			}
		}
		
		public void posOrder(Node node) {
			if (node != null) {
				posOrder(node.leftNode);
				posOrder(node.rightNode);
				System.out.print(node.data+"\t");
			}
		}
		
	}
	
	
	
	

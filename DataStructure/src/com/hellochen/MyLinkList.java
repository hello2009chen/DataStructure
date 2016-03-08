package com.hellochen;

public class MyLinkList {
	
	private Node head;
	
	private Node currentNode;
	
	private class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			currentNode = head;
		} else {
			currentNode.next = new Node(data);
			currentNode = currentNode.next;
		}
	}
	
	public void printLinkList(Node node) {
		if (node == null) {
			return;
		}
		
		currentNode = node;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		MyLinkList myLinkList = new MyLinkList();
		for (int i = 0; i < arrays.length; i++) {
			myLinkList.add(arrays[i]);
		}
		myLinkList.printLinkList(myLinkList.head);
	}
	
}

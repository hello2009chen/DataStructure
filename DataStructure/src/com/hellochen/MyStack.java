package com.hellochen;

public class MyStack {
	
	private Node top;
	
	private class Node {
		Node next;
		int data;
		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}
	
	public void push(int data) {
		Node node = new Node(data);
		if (top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
	}
	
	public void pop() {
		if (top == null) {
			return;
		}
		
		while (top.next != null) {
			System.out.print(top.data+"\t");
			top = top.next;
		}
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		for (int i = 0; i < arrays.length; i++) {
			myStack.push(arrays[i]);
		}
		
		for (int i = 0; i < arrays.length; i++) {
			myStack.pop();
		}
	}
}

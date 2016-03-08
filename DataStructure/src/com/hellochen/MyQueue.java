package com.hellochen;
import javax.management.Query;


public class MyQueue {
	
	private Node head;
	private Node tail;

	private class Node {
		private Node next;
		private int data;
		public Node (int data){
			this.next = null;
			this.data = data;
		}
	}
	
	public void enQueue(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void deQueue() {
		if (head == null) {
			return;
		}
		
		int val = head.data;
		head = head.next;
		if (head == tail) tail = head;
		System.out.print(val+"\t");
	}
	
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		int[] arrays = new int[] { 10, 90, 23, 34, 45, 23, 56, 34, 23, 89 };
		for (int i = 0; i < arrays.length; i++) {
			myQueue.enQueue(arrays[i]);
		}
		
		for (int i = 0; i < arrays.length; i++) {
			myQueue.deQueue();
		}
	}
}

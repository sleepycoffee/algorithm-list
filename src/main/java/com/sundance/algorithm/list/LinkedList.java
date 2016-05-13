package com.sundance.algorithm.list;

public class LinkedList{
	
	private Node head;
	private Node tail;

	public LinkedList(){
		this.head = new Node("head");
		tail = head;
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}


	public void add(Node node){
		tail.setNext(node);
		tail = node;
	}

}

package com.sundance.algorithm.list;

public class Node {

	private Node next;
	private String data;

	public Node(String data){
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String toString(){
		return this.data;
	}
	
}

package Stackpackage;

import LinkedList.SinglyLinkedList;

public class StackLL {
	private int pointer = -1;
	private SinglyLinkedList list;
	final int capacity = 10;
	
	StackLL() {
		list = new SinglyLinkedList();
	}
	
	public boolean isFull() {
		return pointer == capacity;
	}
	
	public boolean push(int val) {
		if(isFull()) {
			System.out.println("Overflow");
			return false;
		}
		else {
			pointer++;
			return list.prepend(val);
		}
		
	}
	
	public void diplay() {
		System.out.print("(TOP)");
		list.display();
	}
	
	public int pop() {
		if(list.isEmpty()) {
			System.out.println("Underflow");
			return -1;
		}else {
			int data = list.SearchIndex(0);
			pointer--;
			list.deleteAtFirst();
			return data;
		}
	}
	
	public int peek() {
		return pointer>=0?list.SearchIndex(0):-1;
	}
}

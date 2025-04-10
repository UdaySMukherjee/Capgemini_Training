package queue;

import LinkedList.SinglyLinkedList;

public class QueueLL {
	SinglyLinkedList list;
	int pointer = -1;
	int capacity = 10;
	
	QueueLL(){
		list = new SinglyLinkedList();
	}
	
	public boolean insert(int value) {
		if(isFull()) {
			System.out.println("Overflow");
			return true;
		}else {
			pointer++;
			list.append(value);
			return true;
		}
	}
	
	public int delete() {
		if(isEmpty()) {
			return -1;
		}else {
			int value = list.SearchIndex(0);
			list.deleteAtFirst();
			return value;
		}
	}

	public boolean isEmpty() {
		return pointer == -1;
	}

	public boolean isFull() {
		return pointer == capacity;
	}
	
	public int getSize() {
		return pointer;
	}
	
	public void display() {
		System.out.print("(Front)");
		list.display();
		System.out.println("(Rear)");
	}
}

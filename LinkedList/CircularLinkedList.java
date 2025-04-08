package LinkedList;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	private int size;

	private class Node{
		int value;
		Node next;

		Node(int value){
			this.value = value;
		}
	}

	public boolean isEmpty() {
		return head==null && tail==null;
	}

	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
			tail.next = head;
		}else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
			tail.next=head;
		}else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
		return true;
	}
		
	public boolean insertAtIndex(int value, int index) {
		if(index<=0) {
			return prepend(value);
		}else if(index>size) {
			return append(value);
		}else {
			Node newNode = new Node(value);
			Node currentNode = head;
			Node previousNode = null;
			int currentIndex = 0;
			do {
				previousNode = currentNode;
				currentIndex++;
				currentNode = currentNode.next;
			}
			while(currentIndex<index);
			previousNode.next = newNode;
			newNode.next = currentNode;
		}
		size++;
		return true;
	}
	
	public boolean updateAtIndex(int value, int index) {
		if(isEmpty()) {
			System.out.println("Empty Linked List");
			return true;
		}else if(index<0 || index>size) {
			return false;
		}else {
			Node currentNode = head;
			int currentIndex = 0;
			do {
				currentIndex++;
				currentNode = currentNode.next;
			}while(currentIndex<index);
			currentNode.value=value;
		}
		return true;
	}
	
	public boolean deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("Empty Linked List");
			return true;
		}else if(head.next.next==head) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			do {
				temp=temp.next;
			}while(temp.next.next!=head);
			temp.next=head;
			tail=temp;
			tail.next=head;
		}
		size--;
		return true;
	}
	
	public boolean deleteFromFirst() {
		if(isEmpty()) {
			System.out.println("Empty Linked List");
			return true;
		}else if(head.next.next==head) {
			head = null;
			tail = null;
		}else {
			head = head.next;
			tail.next=head;
		}
		size--;
		return true;
	}
	
	public boolean deleteAtIndex(int index) {
		if(index<=0) {
			return deleteFromFirst();
		}else if(index>size) {
			return deleteAtEnd();
		}else {
			Node currentNode = head;
			int currentIndex = 0;
			do {
				currentIndex++;
				currentNode = currentNode.next;
			}while(currentIndex<index-1);
			currentNode.next = currentNode.next.next;
		}
		size--;
		return true;
	}
	
	public int search(int num) {
		Node currentNode = head;
		int currentIndex = 0;
		do {
			if(currentNode.value==num) {
				return currentIndex;
			}else {
				currentIndex++;
				currentNode = currentNode.next;
			}
		}while(currentNode!=head);
		return -1;
	}
	
	public boolean reverse() {
		if(isEmpty()) {
			System.out.println("Linked List Empty");
			return false;
		}else {
			Node prev = null;
			Node current = head;
			Node next = null;
			do {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			while (current != head);
			tail = head;
			head = prev;
			tail.next = head;
			return true;
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void display() {
		Node temp = head;
		if(temp==null) {
			System.out.print("Empty");
			return;
		}
		do {
			System.out.print(temp.value+"->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println("head("+head.value+")");
	}
}

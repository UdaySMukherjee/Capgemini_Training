package LinkedList;

public class SinglyLinkedList {
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		}else {
			tail.next=node;
			tail=node;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		}else {
			node.next=head;
			head=node;
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
			while(currentNode != null && currentIndex<index) {
				previousNode = currentNode;
				currentIndex++;
				currentNode = currentNode.next;
			}
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
			while(currentIndex<index) {
				currentIndex++;
				currentNode = currentNode.next;
			}
			currentNode.value=value;
		}
		return true;
	}
	
	public boolean deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("Empty Linked List");
			return true;
		}else if(head.next==null) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
		size--;
		return true;
	}
	
	public boolean deleteFromFirst() {
		if(isEmpty()) {
			System.out.println("Empty Linked List");
			return true;
		}else if(head.next==null) {
			head = null;
			tail = null;
		}else {
			head = head.next;
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
			while(currentIndex<index-1) {
				currentIndex++;
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
		}
		size--;
		return true;
	}
	
	public boolean reverse() {
		if(isEmpty()) {
			System.out.println("Linked List Empty");
			return false;
		}else {
			Node prev = null;
			Node current = head;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			tail = head;
			head = prev;
			return true;
		}
	}

	public int search(int num) {
		Node currentNode = head;
		int currentIndex = 0;
		while(currentNode!=null) {
			if(currentNode.value==num) {
				return currentIndex;
			}else {
				currentIndex++;
				currentNode = currentNode.next;
			}
		}
		return -1;
	}
	
	public int SearchIndex(int index) {
		if(index>size || index<0) {
			return -1;
		}else {
			Node temp = head;
			int i = 0;
			while(temp!=null && i<index) {
				temp = temp.next;
				i++;
			}
			return temp.value;
		}
	}
	
	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	
}

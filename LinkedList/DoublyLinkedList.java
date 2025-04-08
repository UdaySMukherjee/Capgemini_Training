package LinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	private class Node{
		int value;
		Node next;
		Node prev;

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
		}else {
			tail.next = node;
			node.prev=tail;
			tail = node;
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
			head.prev=node;
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
			do {
				previousNode = currentNode;
				currentIndex++;
				currentNode = currentNode.next;
			}
			while(currentIndex<index);
			previousNode.next = newNode;
			newNode.prev = previousNode;
			newNode.next = currentNode;
			currentNode.prev = newNode;
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
			while(currentIndex<index){
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
		}else if(head.next.next==head) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			while(temp.next!=tail){
				temp=temp.next;
			}
			tail=temp;
			tail.next=null;
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
			head.prev = null;
		}
		size--;
		return true;
	}

	public boolean deleteAtIndex(int index) {
		if(index<=0) {
			return deleteFromFirst();
		}else if(index>=size) {
			return deleteAtEnd();
		}else {
			Node currentNode = head;
			Node previousNode = null;
			int currentIndex = 0;
			while(currentIndex<index){
				previousNode = currentNode;
				currentIndex++;
				currentNode = currentNode.next;
			}
			previousNode.next = currentNode.next;
			currentNode.next.prev = previousNode;
		}
		size--;
		return true;
	}

	public int search(int num) {
		Node currentNode = head;
		int currentIndex = 0;
		while(currentNode!=null){
			if(currentNode.value==num) {
				return currentIndex;
			}else {
				currentIndex++;
				currentNode = currentNode.next;
			}
		};
		return -1;
	}

	public boolean reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			if(prev!=null) {
				prev.prev = current;
			}
			prev = current;
			current = next;
		}
		tail = head;
		head = prev;
		return true;
	}


	public int getSize() {
		return this.size;
	}

	public void display() {
		Node temp = head;
		System.out.print("null<=>");
		while(temp!=null) {
			System.out.print(temp.value+"<=>");
			temp=temp.next;
		}
		System.out.println("null");
	}
}

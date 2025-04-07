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

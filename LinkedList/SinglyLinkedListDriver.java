package LinkedList;

public class SinglyLinkedListDriver {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(50);
		list.prepend(60);
		list.insertAtIndex(100, 3);
		list.display();
	}
}

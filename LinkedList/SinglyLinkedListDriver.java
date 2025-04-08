package LinkedList;

public class SinglyLinkedListDriver {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.display();
		list.prepend(50);
		list.prepend(60);
		list.display();
		list.insertAtIndex(100, 3);
		list.display();
		list.updateAtIndex(6900, 3);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteFromFirst();
		list.display();
		list.deleteAtIndex(2);
		list.display();
		System.out.println(list.getSize());
		list.reverse();
		list.display();
		System.out.println(list.search(10));
	}
}

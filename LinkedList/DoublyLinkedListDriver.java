package LinkedList;

public class DoublyLinkedListDriver {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.display();
		list.prepend(50);
		list.prepend(60);
		list.display();
		list.insertAtIndex(100, 4);
		list.display();
		list.updateAtIndex(200, 3);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteFromFirst();
		list.display();
		list.deleteAtIndex(2);
		list.display();
		System.out.println(list.search(100));
		System.out.println(list.getSize());
		list.reverse();
		list.display();
	}

}

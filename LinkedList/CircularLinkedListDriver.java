package LinkedList;

public class CircularLinkedListDriver {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.display();
		list.prepend(60);
		list.prepend(50);
		list.display();
		list.insertAtIndex(100, 3);
		list.display();
		list.updateAtIndex(200, 3);
		list.display();
//		list.deleteAtEnd();
//		list.display();
//		list.deleteFromFirst();
//		list.display();
//		list.deleteAtIndex(3);
//		list.display();
		System.out.println(list.getSize());
		System.out.println(list.search(200));
		list.reverse();
		list.display();
	}
}

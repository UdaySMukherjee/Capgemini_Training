package queue;

public class QueueLLDriver {
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		q.insert(50);
		q.insert(80);
		q.display();
		q.delete();
		q.delete();
		q.display();
		System.out.println("Size: "+q.getSize());
	}
}

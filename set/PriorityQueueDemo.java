package set;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		SortByPrice s = new SortByPrice();
		PriorityQueue<Mobile> q = new PriorityQueue<Mobile>(s);
		q.add(new Mobile("Samsung",60000));
		q.add(new Mobile("Apple",83000));
		q.add(new Mobile("Vivo",21000));
		q.add(new Mobile("Poco",6350000));
		q.add(new Mobile("Realme",15000));
		//System.out.println(q);
		while(! q.isEmpty()) {
			System.out.print(q.poll() + "\n");
		}
	}
}

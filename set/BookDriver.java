package set;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		SortByName s = new SortByName();
//		TreeSet t = new TreeSet();
		TreeSet<Book> t = new TreeSet<Book>(s);
		t.add(new Book(101,"Devil's Bible",50.00));
		t.add(new Book(12,"9/11 Fantasies",50.00));
		t.add(new Book(34,"Bajrang Dal",50.00));
		System.out.println(t);
	}
}

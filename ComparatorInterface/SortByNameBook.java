package ComparatorInterface;

import java.util.Comparator;

public class SortByNameBook implements Comparator<Book> {
	@Override
	public int compare(Book b1,Book b2) {
		return b1.name.compareTo(b2.name);
	} 
}

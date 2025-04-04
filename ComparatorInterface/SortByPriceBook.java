package ComparatorInterface;

import java.util.Comparator;

public class SortByPriceBook implements Comparator<Book>{
	@Override
	public int compare(Book b1,Book b2) {
		return Double.compare(b1.price, b2.price);
	}
}

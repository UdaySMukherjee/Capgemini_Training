package ComparatorInterface;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {
	@Override
	public int compare(Product o1,Product o2) {
		return o1.name.compareTo(o2.name);
	}

}

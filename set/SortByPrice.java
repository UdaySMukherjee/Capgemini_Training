package set;

import java.util.Comparator;

public class SortByPrice implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return (int) (o1.price-o2.price);
	}

}

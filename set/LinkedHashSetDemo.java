package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(30);
		System.out.println(lh);
	}
}

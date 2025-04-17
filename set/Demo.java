package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add("Hi");
		System.out.println(h);
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(10);
		lh.add("Hi");
		lh.add(78.9);
//		lh.add(null);
		System.out.println(lh);
		
		TreeSet t = new TreeSet();
		t.add(10);
		t.add("Hi");
		System.out.println(t);
	}
}

package set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> tst = new TreeSet<Integer>();
		tst.add(10);
		tst.add(0);
		tst.add(110);
		tst.add(0);
		System.out.println(tst);
	}
}

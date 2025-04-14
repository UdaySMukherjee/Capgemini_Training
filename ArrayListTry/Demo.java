package ArrayListTry;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("a1 "+a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.addAll(a1);
		a2.add(102);
		a2.add(103);
		System.out.println("a2 "+a2);
		
		a2.removeAll(a1);
		System.out.println("a2 "+a2);
	}
}

package LinkedListClass;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(50);
//		list.add(98.76);
//		list.add("dinga");
//		list.add(true);
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
//			Object temp = list.get(i);
			int temp = list.get(i);
			System.out.println(temp);
		}
		
		for(Object x: list) {
			System.out.println(x);
		}
	}
	
	
}

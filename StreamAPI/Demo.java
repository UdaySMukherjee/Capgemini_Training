package StreamAPI;

import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = List.of(9,1,8,5,1,3,8,0,5,3,9);
		System.out.println(list);
//		List<Integer> list2 = new ArrayList<>();
//		list.forEach(n1->{
//			if(n1%2==0) {
//				list2.add(n1);
//			}
//		});
//		System.out.println();
//		list2.forEach(n1->System.out.print(n1+" "));
		List<Integer> list2 = list.stream().filter(i -> i%2==0).toList();
		System.out.println(list2);
		
		List<Integer> list3 = list.stream().map(i -> i*2).toList();
		System.out.println(list3);
		
		List<Integer> list4 = list.stream().skip(2).toList();
		System.out.println(list4);
		
		List<Integer> list5 = list.stream().limit(2).toList();
		System.out.println(list5);
		
		List<Integer> list6 = list.stream().sorted().toList();
		System.out.println(list6);
		
		List<Integer> list7 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list7);
		
		List<Integer> list8 = list.stream().distinct().toList();
		System.out.println(list8);
		
		List<Integer> list9 = list.stream().filter(n->n<5).toList();
		System.out.println(list9);
		
		
	}
}

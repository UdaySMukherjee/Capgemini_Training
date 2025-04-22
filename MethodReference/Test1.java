package MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,9,8,4,6,2);
		//list.forEach(s -> System.out.println(s));
//		list.forEach(System.out::println);
		Collections.sort(list,Integer::compareTo);
//		list.forEach(System.out::print);
		
		Integer[] arr = list.toArray(Integer[]::new);
		System.out.println(arr.length);
	}
}

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MyClass {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("apple","magi","rondi","guava","chutmarani");
		List<String> str1 =str.stream().map(s->s.toUpperCase()).toList();
		System.out.println(str1);
		
		System.out.println(str.stream().filter(s->s.charAt(0)=='a').findFirst().get());	
	}
}

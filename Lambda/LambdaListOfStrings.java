package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaListOfStrings {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("apple","Ball","Cat","Doll");
		Collections.sort(arr, (s1,s2)-> s1.compareTo(s2));
		arr.forEach(s -> System.out.print(s+" "));
		System.out.println();
		Collections.sort(arr, (s1,s2)-> s1.length()-s2.length());
		arr.forEach(s -> System.out.print(s+" "));
	}
}

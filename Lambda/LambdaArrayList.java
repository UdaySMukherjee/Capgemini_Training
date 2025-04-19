package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaArrayList {
	public static void main(String[] args) {
		List<Integer> arr = List.of(1,2,3,4,5);
		List<Integer> arr1 = Arrays.asList(51,16,71,8,9);
		System.out.println(arr);
		System.out.println(arr1);
		Collections.sort(arr1,(n1,n2)->n2-n1);
		arr1.forEach( t -> System.out.print(t+" "));
	}
}

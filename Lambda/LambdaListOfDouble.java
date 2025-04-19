package Lambda;

import java.util.Collections;
import java.util.List;

public class LambdaListOfDouble {
	public static void main(String[] args) {
		List<Double> arr = List.of(9.7,54.6,10.00,11.34,2.22,1.0,2.3,6.5,6.7);
		Collections.sort(arr, (d1,d2) -> Double.compare(d1, d2));
		arr.forEach(d -> System.out.println(d+" "));
	}
}

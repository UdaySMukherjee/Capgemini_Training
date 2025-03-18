package array;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {1,7,9,3,4,0,6};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr,4));
		arr = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr));
		int[] b = Arrays.copyOfRange(arr, 0,4);
		System.out.println(Arrays.toString(b));
	}
}

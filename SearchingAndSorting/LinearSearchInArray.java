package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearchInArray {
	public static int LinearSearchAlgo(int[] arr, int element) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==element)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter length: ");
			int n = sc.nextInt();
			int[] array = new int[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter element: ");
				array[i] = sc.nextInt();
			}
			System.out.print("Enter the key: ");
			int element = sc.nextInt();
			int index = LinearSearchAlgo(array,element);
			if(index!= -1)
				System.out.println("Element found at Index: "+index);
			else
				System.out.println("Element not found");
		}
	}
}

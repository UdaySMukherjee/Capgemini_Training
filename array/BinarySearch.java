package array;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int element = sc.nextInt();
		
		int start = 0;
		int end = arr.length;
		int mid=start + ((end - start)/2);
		while(start<end) {
			mid = start + ((end - start)/2);
			if (arr[mid]==element) {
				System.out.print("Element found at index "+mid);
				break;
			}
			else if(arr[mid]>element)
				start = mid+1;
			else if(arr[mid]<element)
				end = mid-1;
			else
				System.out.print("Element not found ");
		}
	}
}

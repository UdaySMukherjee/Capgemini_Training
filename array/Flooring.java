package array;

import java.util.Arrays;
import java.util.Scanner;


public class Flooring {

	public static int ceiling(int[] arr,int number) {
		int start = 0;
		int end = arr.length-1;
		int mid=start+(end-start)/2;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(arr[mid]==number) {
				return mid;
				}
			else if(arr[mid]<number)
				start = mid+1;
			else {
				end= mid-1;
				}
		}
		return end;
	}
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,12,23,42};
		Arrays.sort(arr);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int searchNumber = sc.nextInt();
		System.out.println(ceiling(arr,searchNumber));
		sc.close();
	}
}

package Sorting;

import java.util.Arrays;

public class Quicksort {
	public static int partition(int[] arr,int pivot,int end_index) {
		int swap = pivot;
		int index = pivot+1;
		while(index<=end_index) {
			if(arr[index]<arr[pivot]) {
				swap++;
				int temp = arr[swap];
				arr[swap] = arr[index];
				arr[index] = temp;
			}
			index++;
		}
		int temp = arr[swap];
		arr[swap] = arr[pivot];
		arr[pivot] = temp;
		return swap;
	}
	
	public static void quicksort(int[] arr,int start,int end) {
		if(start<end) {
			int pivot = partition(arr,start,end);
			quicksort(arr, start, pivot-1);
			quicksort(arr, pivot+1, end);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3,2,1,0,5,4,7};
		quicksort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}

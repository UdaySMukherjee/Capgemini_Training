package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {2,5,3,1,4,0};
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(array));
		boolean swapped;
		for(int i=0;i<array.length;i++) {
			swapped = false;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(array));
	}
}

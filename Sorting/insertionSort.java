package Sorting;

public class insertionSort {

	public static void insertion_Sort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		insertion_Sort(arr);
		// bubbleSort(arr);
		System.out.println("Sorted array:");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}
}

package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter size: ");
			int size = sc.nextInt();
			createIntArray( size);
		case 1:
			addvalues(arr,size);
		case 1:
			delete
		case 3:
			System.out.print("Enter index: ");
			int index = sc.nextInt();
			System.out.print("Enter new data: ");
			int newdata= sc.nextInt();
			updateArray(arr,index,newdata);
		case 4:
			displayArray(arr);
		}
	
		public static void createIntArray(int size) {
			int[] arr = new int[size];
		}
		
		public static void addvalues(int[] arr, int size) {
			int i = 0;
			while(i<size) {
				System.out.print("Enter number: ");
				arr[i]= sc.nextInt();
				i+=1;
			}
		}
		
		public static void updateArray(int[] arr,int index, int newdata) {
			arr[index] = newdata;
		}
		public static void displayArray(int[] arr) {
			System.out.print(Arrays.toString(arr));
		}
	}
}

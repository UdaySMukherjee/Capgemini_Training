package array;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		for(String data: arr) {
			System.out.print(data+" ");
		}
	}
}

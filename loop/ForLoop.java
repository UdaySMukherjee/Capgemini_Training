package loop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number: ");
		int start = sc.nextInt();
		System.out.print("Enter end number: ");
		int end = sc.nextInt();
		for(;start<=end;start++)
			System.out.println(start);
	sc.close();
	}
}

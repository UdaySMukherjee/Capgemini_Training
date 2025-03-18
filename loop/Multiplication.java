package loop;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number: ");
		int number = sc.nextInt();
		
		for(int start=1;start<=10;start++)
			System.out.println(number+"*"+start+"="+(number*start));
	sc.close();
	}
}

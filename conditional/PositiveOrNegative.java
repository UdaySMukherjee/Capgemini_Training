package conditional;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if (number>0)
			System.out.print("positive");
		else
			System.out.print("Negative");
		sc.close();
	}
}

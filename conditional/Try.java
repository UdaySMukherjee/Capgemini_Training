package conditional;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter operator: ");
		char operator = sc.next().charAt(0);
		if (operator == '+') {
			System.out.print("Addition"+(num1 + num2));
		}
		else if (operator == '-') {
			System.out.print("Subtraction"+(num1 - num2));
		}
		else if (operator == '*') {
			System.out.print("Multiplication"+(num1 * num2));
		}
		else if (operator == '/') {
			System.out.print("division:"+(num1 / num2));
		}else {
			System.out.print("Invalid operator");
		}
		sc.close();
	}
}

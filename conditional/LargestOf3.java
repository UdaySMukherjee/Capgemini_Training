package conditional;

import java.util.Scanner;

public class LargestOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.print(num1+" is the largest");
			}else {
				System.out.print(num3+" is the largest");
			}
		}if(num2>num3) {
			System.out.print(num2+" is the largest");
		}else{
			System.out.print(num3+" is the largest");
		}
		sc.close();
	}
}

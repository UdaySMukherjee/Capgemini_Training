package mathdemo;

import java.util.Scanner;

public class ScaMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int intInput = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String ");
		String stringInput = sc.nextLine();
		
		System.out.println(intInput+"\t"+stringInput);
		sc.close();
	}
}

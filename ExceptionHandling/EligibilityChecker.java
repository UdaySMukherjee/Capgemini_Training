package ExceptionHandling;

import java.util.Scanner;

public class EligibilityChecker {
	public static String ageChecker(int age) {
		if(age>=21) {
			return "Go Get a job ";
		}else {
			throw new InvalidAge("Err: 404 Lulli not found");
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		System.out.print("Enter Age: ");
		int n = sc.nextInt();
		ageChecker(n);
		}
	}
}

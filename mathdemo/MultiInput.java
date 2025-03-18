package mathdemo;

import java.util.Scanner;

public class MultiInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Scanner sc = new Scanner(s);
		sc.useDelimiter("[+,-.]");
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(n);
		}
		sc.close();
		scanner.close();
		
	}
}

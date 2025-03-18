package loop;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range: ");
		int range = sc.nextInt();
		System.out.println(first);
		System.out.println(second);
		int next = first+second;
		System.out.println(next);
		while(next<range) {
			first = second;
			second = next;
			next = first+second;
			System.out.println(next);
		}
	}
}

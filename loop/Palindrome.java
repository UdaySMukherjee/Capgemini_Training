package loop;

import java.util.Scanner;

public class Palindrome {
	public static int Reverse(int num){
		int count_digits = 0;
		int reverse = 0;
		int last_digit=0;
		
		int num1 =num;
		while(num1>0) {
			last_digit = num1%10;
			reverse = reverse *10 + last_digit;
			num1 = (int)num1/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = sc.nextInt();
		
		int reverse = Reverse(number);
		if(number==reverse)
			System.out.print(true);
		else
			System.out.print(false);
	}
}

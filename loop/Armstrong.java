package loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count_digits = 0;
		int sum = 0;
		int last_digit=0;
		
		int num1=num;
		while(num1>0) {
			count_digits+=1;
			num1 = (int)num1 /10;
		}
		
		num1 =num;
		while(num1>0) {
			last_digit = num1%10;
			sum= sum + (int)Math.pow(last_digit, count_digits);
			num1 = (int)num1/10;
		}
		if(sum==num)
			System.out.print("Armstrong Number");
		else
			System.out.print("NOT Armstrong Number");
	}
}

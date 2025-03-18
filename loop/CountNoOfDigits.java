package loop;

import java.util.Scanner;

public class CountNoOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count_even = 0;
		int count_odd = 0;
		int product = 0;
		int last_digit=0;
		while(num>0) {
			last_digit = num%10;
			if(last_digit%2==0) {
				count_even+=1;
			}else {
				count_odd+=1;
			}
			product = count_even*count_odd;
			num = (int)num /10;
		}
		System.out.print(product);
	}
}

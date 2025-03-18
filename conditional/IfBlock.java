package conditional;

import java.util.Scanner;

public class IfBlock {
	public static void main(String[] args) {

		int vanillaIcecreamPrice = 40;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter money Shinchan has ");
		int money = sc.nextInt();
		
		if (money > vanillaIcecreamPrice) {
			System.out.print("Shinchan can buy vanilla ice-cream");
		}else {
			System.out.print("Shinchan cannot buy vanilla ice-cream");
		}
		sc.close();
	}
}

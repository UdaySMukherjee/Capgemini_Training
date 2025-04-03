package ExceptionHandling;

import java.util.Scanner;

public class Atm {
	private double money;
	private int pin = 1234;
	
	Atm(double amount){
		this.money = amount;
	}
	
	public static void withdraw(double amount,int pin) {
		if(amount>0) {
			if(pin!=1234) {
				throw new IncorrectPin();
			}
			else {
				System.out.print("Withdrawl Done!");
			}
		}
		else {
			throw new InvalidMoney();
		}
	}
		
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);){
			double amount  = sc.nextDouble();
			int pin = sc.nextInt();
			try {
				Atm a = new Atm(500);
				a.withdraw(amount, pin);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

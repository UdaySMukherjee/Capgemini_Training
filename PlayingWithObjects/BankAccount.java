package PlayingWithObjects;

public class BankAccount {
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BankAccount withdraw(double money) {
		if(money>0 && money<=getBalance()) {
			setBalance(getBalance()-money);
		}else {
			System.out.print("Insufficient Balance");
		}
		return this;
	}
	
	public BankAccount deposit(double money) {
		if(money>0) {
			setBalance(getBalance()+money);
		}
		return this;
	}
}

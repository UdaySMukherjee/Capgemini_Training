package PlayingWithObjects;

public class Atm {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.print(b.deposit(10000).deposit(5000).withdraw(2500).getBalance());
	}
}

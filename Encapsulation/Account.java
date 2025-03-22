package Encapsulation;

public class Account {
	private String AccountHoldersName;
	private double Balance;
	private long AccountNumber;
	
	Account(String AccountHoldersName,double Balance,long AccountNumber){
		this.AccountHoldersName = AccountHoldersName;
		this.Balance = Balance;
		this.AccountNumber = AccountNumber;
		System.out.print("Account Created");
	}
	
	public String setAccountHoldersName() {
		return this.AccountHoldersName;
	}
	public double setBalance() {
		return this.Balance;
	}
	public long setAccountNumber() {
		return this.AccountNumber;
	}
	
	public void getAccountHoldersName(String AccountHoldersName) {
		this.AccountHoldersName = AccountHoldersName;
	}
	public void getBalance(double Balance) {
		this.Balance = Balance;
	}
	public void getAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
}

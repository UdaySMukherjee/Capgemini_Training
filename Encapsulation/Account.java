package Encapsulation;

public class Account{
    private String accountHolderName;
    private double balance;
    private int accountNumber;

    Account(String name){
        this.accountHolderName =name;
        this.balance=0.0;
        this.accountNumber=001;
        System.out.println("Account is created successfully!");
    }
    Account(String name, double amount){
        this.accountHolderName =name;
        this.balance=amount;
        this.accountNumber=001;
        System.out.println("Account is created successfully with initial amount "+amount);
    }

    // Getter start
    public void getAccountName(){
        System.out.println("Account holder name: "+this.accountHolderName);
    }
    public void getAccountbalance(){
        System.out.println("Account balance: "+this.balance);
    }
    public void getAccountNunmber(){
        System.out.println("Account number: "+this.accountNumber);
    }
    // Getter end

    // Setter
    public void withdrawamount(double amount){
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            System.out.println(amount+" withdrawal is successfull!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    public void depositAmount(double amount){
        this.balance+=amount;
        System.out.println(amount+" is deposited successfully!");
    }
    // Setter end
}

package Encapsulation;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = null;
        boolean flag=true, flag2=true;
        while (flag) {
            System.out.println("\nWelcome to our ATM service!");
            if(flag2){
                System.out.println("1-> create an account");
                System.out.println("2-> create an account with initial amount");
                System.out.println("3-> Deposit some amount");
                System.out.println("4-> Withdraw some amount");
                System.out.println("5-> Show account holder name");
                System.out.println("6-> Show account number");
                System.out.println("7-> Show account balance");
                System.out.println("8-> Exit\n");
                System.out.println("Enter your choice here:");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your name:");
                        String name = sc.nextLine();
                        ac = new Account(name);
                        flag2=false;
                        break;

                    case 2:
                        System.out.println("Enter your name:");
                        name = sc.nextLine();
                        System.out.println("Enter initial amount:");
                        double amount = sc.nextDouble();
                        ac = new Account(name, amount);
                        flag2=false;
                        break;

                    case 3:
                        System.out.println("Enter amount to be deposited:");
                        amount = sc.nextDouble();
                        ac.depositAmount(amount);
                        break;

                    case 4:
                        System.out.println("Enter withdraw amount:");
                        amount = sc.nextDouble();
                        ac.withdrawamount(amount);
                        break;

                    case 5:
                        ac.getAccountName();
                        break;

                    case 6:
                        ac.getAccountNunmber();
                        break;

                    case 7:
                        ac.getAccountbalance();
                        break;

                    case 8:
                        flag=false;
                        break;
                
                    default:
                }
            }
            else{
                System.out.println("1-> Deposit some amount");
                System.out.println("2-> Withdraw some amount");
                System.out.println("3-> Show account holder name");
                System.out.println("4-> Show account number");
                System.out.println("5-> Show account balance");
                System.out.println("6-> Exit\n");
                System.out.println("Enter your choice here:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to be deposited:");
                        double amount = sc.nextDouble();
                        ac.depositAmount(amount);
                        break;

                    case 2:
                        System.out.println("Enter withdraw amount:");
                        amount = sc.nextDouble();
                        ac.withdrawamount(amount);
                        break;

                    case 3:
                        ac.getAccountName();
                        break;

                    case 4:
                        ac.getAccountNunmber();
                        break;

                    case 5:
                        ac.getAccountbalance();
                        break;

                    case 6:
                        flag=false;
                        break;
                
                    default:
                }
            }
        }
        System.out.println("Thank you!");
        sc.close();
    }
}
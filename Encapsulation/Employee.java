package Encapsulation;

public class Employee {
	String name = "Ankan";
	int age = 45;
	private long phone_number = 9007972481l;
	private double salary = 50000;
	
	public double getSalary() {
		return this.salary;
	}
	public long getPhoneNumber() {
		return this.phone_number;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phone_number = phoneNumber;
	}
}

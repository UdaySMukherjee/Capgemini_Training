package Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.getSalary());
		System.out.println(e.getPhoneNumber());
		e.setSalary(0.0);
		System.out.println(e.getSalary());
	}
}

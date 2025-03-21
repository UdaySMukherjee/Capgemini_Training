package OOPS;

public class DriverEmployee {
	public static void main(String[] args) {
		Employee E1  = new Employee("Ankan",20000,8976895590l);
		System.out.println(E1.name+"\t"+E1.salary+"\t"+E1.phoneNumber);
		Employee E2  = new Employee("Soham",40000,8976895590l);
		System.out.println(E2.name+"\t"+E2.salary+"\t"+E2.phoneNumber);
		Employee E3  = new Employee("Uday",30000,8910827598l);
		System.out.println(E3.name+"\t"+E3.salary+"\t"+E3.phoneNumber);
	}
}

package objectorientedconcepts;

public class DriverLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell",67000.00,16);
		System.out.print(l1.brand+"\n"+l1.price+"\n"+l1.ram);
	}
}

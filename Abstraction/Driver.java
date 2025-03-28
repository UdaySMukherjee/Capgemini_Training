package Abstraction;

public class Driver {
	public static void main(String[] args) {
	Calci c = new CalciImplementation();
	System.out.println(c.add(10,20));
	System.out.println(c.sub(10,20));
	System.out.println(c.mul(10,20));
	}

}

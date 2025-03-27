package Polymorphism;

public class Driver {
	public static void main(String[] args) {
//		Son s = (Son)new Son().create();
		Father f = new Son();
		f.drink();

	}

}

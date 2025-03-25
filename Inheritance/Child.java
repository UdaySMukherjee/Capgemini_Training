package Inheritance;

public class Child extends Parent{
	static {
		System.out.println("Child is loaded");
	}
	static void child() {
		System.out.println("Child method");
	}
}

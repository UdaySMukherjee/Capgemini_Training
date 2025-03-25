package Inheritance;

public class Dog extends Animal{

	//non static var
	int b;
	
	//non static meyhod
	void methodOfChild() {
		System.out.println("Method of child");
	}
		
	//static var
	static int y;
	
	//static method
	static void methodOfChild2t() {
		System.out.println("static Method of Child");
	}
}

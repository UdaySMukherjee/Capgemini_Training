package MethodReference;

public class Calci {
	static int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	
	Calci(){
		System.out.println("Constructor");
	}
}

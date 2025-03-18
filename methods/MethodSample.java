package methods;

public class MethodSample {
	public static void m1() {
		System.out.println("m1");
	}
	public static void m2() {
		m1();
		System.out.println("m2");
	}
	public static void main(String[] args) {
		m3();
		System.out.println("Main method");
	}
	public static void m3() {
		System.out.println("m3");
		m2();
	}
}

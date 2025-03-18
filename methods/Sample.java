package methods;

public class Sample {
	public void test() {
		
		System.out.print("NON Static method");
	}
	public static void main(String[] args) {
		Sample S = new Sample();
		S.test();
	}
}

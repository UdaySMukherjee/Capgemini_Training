package mathdemo;

public class Calculator {
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int sub(int num1, char char1) {
		return num1-char1;
	}
	public static int sub(int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int mul(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	public static void main(String[] args) {
		System.out.println(sub(10,9));
		System.out.println(sub(10,'a'));
		System.out.println(sub(10,9,7));
		System.out.println(mul(10,9));
		System.out.println(mul(10,9,6));
	}
}

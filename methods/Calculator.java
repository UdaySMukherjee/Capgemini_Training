package methods;

public class Calculator {
	public static double add(int num1,int num2) {
		return num1+num2;
	}
	public static int mul(double num1,double num2,double num3) {
		return (int)(num1*num2*num3);
	}
	public static void main(String[] args) {
		System.out.println(add(10,67));
		System.out.print(mul(12.9,34.7,78.0));
	}
}

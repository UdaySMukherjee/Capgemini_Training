package Abstraction;

public class CalciImplementation extends Calci{
	
	@Override
	int add(int num1, int num2) {
		return num1+num2;
	}
	int sub(int num1, int num2) {
		return num1-num2;
	}
	int mul(int num1, int num2) {
		return num1*num2;
	}
}

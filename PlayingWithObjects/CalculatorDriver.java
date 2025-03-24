package PlayingWithObjects;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator c = new Calculator(25.4,4.6);
		Calculator.add(c).mul(c);
		System.out.print(c.getResult());
	}
}

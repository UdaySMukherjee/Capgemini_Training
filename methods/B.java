package methods;

public class B {
	public static char charToAscii(char a) {
		return a;
		//System.out.println("ascii of char " + a + " = " + (int)a);
	}
	public static void fullName(String firstName,String lastName) {
		System.out.print(firstName + " "+ lastName);

	}
	public static void main(String[] args) {
		char b = charToAscii('b');
		System.out.println(b);
		fullName("uday","mukherjee");
	}
}

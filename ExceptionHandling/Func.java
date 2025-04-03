package ExceptionHandling;

public class Func {
	public static int Function() {
		try {
			return 1;
		}
		catch(Exception e) {
			return 2;
		}
		finally {
			return 3;
		}
			
	}
	public static void main(String[] args) {
		System.out.println(Function());
	}
}

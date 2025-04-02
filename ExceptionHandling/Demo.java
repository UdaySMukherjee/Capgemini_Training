package ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Starting");
		try {
			System.out.println("Try 1");
			System.out.println(10/0);
			System.out.println("Try 2");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.print("Done");
		}
	}
}

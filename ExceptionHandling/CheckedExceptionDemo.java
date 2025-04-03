package ExceptionHandling;

public class CheckedExceptionDemo {
	
	public static void printNumbers() throws InterruptedException,NullPointerException {
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
			Thread.sleep(1000);
		}
	}
	
	public static void demo2() throws InterruptedException {
		printNumbers();
	}
	
	public static void main(String[] args) {
		try {
			demo2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo6 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Demo2.txt");
		pw.println(true);
		pw.println(10.5);
		pw.println('a');
		pw.println(1000);
		pw.flush();
		System.out.println("Doneeeee");
	}
}

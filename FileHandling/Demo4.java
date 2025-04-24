package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Demo2.txt");
		BufferedWriter b = new BufferedWriter(f);
		b.write("hello");
		b.write(100);
		b.newLine();
		b.write(99);
		b.flush();
		System.out.println("done");
	}
}

package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		FileReader f2 = new FileReader("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Demo.txt");
		int i = f2.read();
		while(i!=-1) {
			System.out.print((char) i);
			i=f2.read();
		}
	}
}

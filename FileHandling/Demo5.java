package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Demo2.txt");
		BufferedReader b = new BufferedReader(f);
		String line = b.readLine();
		while(line!=null) {
			System.out.println(line);
			line = b.readLine();
		}
		
	}
}

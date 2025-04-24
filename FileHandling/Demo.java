package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) throws IOException {
		System.out.println("Create folder");
		File f = new File("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder");
		boolean b = f.mkdir();
		System.out.println(b);
		File f1 = new File("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Demo.txt");
		System.out.println("Create new file");
		boolean a = f1.createNewFile();
		System.out.println(a);
		System.out.println(f.isDirectory());
		System.out.println(f1.isFile());
		String[] files = f.list();
		System.out.println(Arrays.toString(files));
		
	}
}

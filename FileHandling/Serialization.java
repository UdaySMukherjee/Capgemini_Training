package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Employee.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		Employee employee = new Employee(101, 20000, "Ankan");
		o.writeObject(employee);
		System.out.println("Employee Saved to file");
		
	}
}

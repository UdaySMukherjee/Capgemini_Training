package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\MyJavaFolder\\Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee employee = (Employee) ois.readObject();
		
		System.out.println(employee.getId());
		System.out.println(employee.getSalary());
		System.out.println(employee.getName());
		
	}
}

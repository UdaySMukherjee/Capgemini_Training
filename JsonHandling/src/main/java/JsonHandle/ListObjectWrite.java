package JsonHandle;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ListObjectWrite {
	public static void main(String[] args) {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher("Bhaskar", 40));
		list.add(new Teacher("Somrick", 70));
		list.add(new Teacher("Bhargav", 48));
		
		ObjectMapper object = new ObjectMapper();
		FileWriter f = new FileWriter("C:\\Users\\User\\Desktop\\new\\Capgemini-training\\Student.json");
		ObjectMapper.writeValue(object,f);
		
	}
}

package JsonHandle;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteObject {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Teacher teacher = new Teacher("Ankan",40);

		ObjectMapper objectMapper = new ObjectMapper();
		FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\new\\Capgemini-training\\Student.json");
		objectMapper.writeValue(fw, teacher);

		System.out.println("data entered");
		
		FileReader filereader = new FileReader("C:\\Users\\User\\Desktop\\new\\Capgemini-training\\Student.json");
		Teacher t = objectMapper.readValue(filereader, Teacher.class);
		System.out.println(t.getName()+"\t"+t.getExperience());

	}
}

package JsonHandle;

import java.awt.List;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListObjectRead {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\new\\Capgemini-training\\Student.json");
		
		List<Teacher> list = objectMapper.readValue(fileReader, List.class);
		System.out.println(list);
	}
}

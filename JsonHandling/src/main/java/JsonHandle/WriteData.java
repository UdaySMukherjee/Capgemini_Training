package JsonHandle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;



public class WriteData {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Object> map = new HashMap<String,Object>();
		
		Teacher teacher = new Teacher("Mangu",18);
		
		map.put("ID", 101);
		map.put("Name", "Dinga");
		map.put("Percentage", 98.90);
		
		String[] subjects = {"English","Science","Maths"};
		map.put("Subjects", subjects);
		
		List<String> subs = Arrays.asList("Geography","History","Civics");
		map.put("ESP", subs);
		
		map.put("Teacher", teacher);
		
		FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\new\\Capgemini-training\\Student.json");
		objectMapper.writeValue(fw, map);
		System.out.println("data written");
	}
}

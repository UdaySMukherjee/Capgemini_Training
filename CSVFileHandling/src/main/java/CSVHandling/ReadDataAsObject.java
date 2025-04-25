package CSVHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class ReadDataAsObject {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\CSVFolder\\abc.csv");
		CsvToBean<Employee> c = new CsvToBeanBuilder(file).withType(Employee.class).build();
		List<Employee> list = c.parse();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}	
	
}

package CSVHandling;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class WriteDataAsObject {
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		Employee emp = new Employee("Krishna",27,90000);
		FileWriter fw = new FileWriter("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\CSVFolder\\abc.csv");
		StatefulBeanToCsv<Employee> b = new StatefulBeanToCsvBuilder(fw).withApplyQuotesToAll(false).build();
		b.write(emp);
		fw.flush();
		System.out.println("Data Written");
	}
}

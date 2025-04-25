package CSVHandling;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteData {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\CSVFolder\\abc.csv");
		CSVWriter writer = new CSVWriter(f,
				CSVWriter.DEFAULT_SEPARATOR,
				CSVWriter.DEFAULT_QUOTE_CHARACTER,
				CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				CSVWriter.DEFAULT_LINE_END);
		
		String[] header = {"Name","Age","Salary"};
		writer.writeNext(header);
		
		String[] data1 = {"Jayasree","15","80000"};
		writer.writeNext(data1);
		
		String[] data2 = {"Mulla","34","30000"};
		writer.writeNext(data2);
		
		writer.flush();
		
		System.out.println("Data Written");
	}
}

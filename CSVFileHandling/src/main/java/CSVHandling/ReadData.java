package CSVHandling;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadData {
	public static void main(String[] args) throws CsvValidationException, IOException {
		FileReader f = new FileReader("C:\\Users\\UDAY SANKAR\\Desktop\\codes\\src\\CSVFolder\\abc.csv");
		CSVReader reader = new CSVReader(f);
		
		String[] data = reader.readNext();
		
		while(data != null) {
			for(String string : data) {
				System.out.print(string+"\t");
			}
			System.out.println();
			data = reader.readNext();
		}
	}
}

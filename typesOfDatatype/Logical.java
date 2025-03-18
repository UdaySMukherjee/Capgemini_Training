package typesOfDatatype;

public class Logical {

	public static void main(String[] args) {
		double price = 30000;
		int ram = 12;
		System.out.println(ram == 8 && price <= 48000);
		int storage = 256;
		System.out.print(ram == 8 || storage >=256);
	}

}
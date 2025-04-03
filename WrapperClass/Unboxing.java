package WrapperClass;

public class Unboxing {
	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i = new Integer(26);
		int i2 = i.intValue();
		System.out.println(i2);
		byte i3 = i.byteValue();
		System.out.println(i3);
		short i4 = i.shortValue();
		System.out.println(i4);
		long i5 = i.longValue();
		System.out.println(i5);
		double i6 = i.doubleValue();
		System.out.println(i2);
		
		int b = i;
		System.out.println(i);
		

	}
	
}

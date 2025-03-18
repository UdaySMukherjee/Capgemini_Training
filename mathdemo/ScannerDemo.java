package mathdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("byte");
//		byte byteInput = sc.nextByte();
//		System.out.println(byteInput);
//		System.out.print("short");
//		short shortInput = sc.nextShort();
//		System.out.println(shortInput);
//		System.out.print("int");
//		int intInput = sc.nextInt();
//		System.out.println(intInput);
//		System.out.print("long");
//		long longInput = sc.nextLong();
//		System.out.println(longInput);
//		System.out.print("bool");
//		boolean boolInput = sc.nextBoolean();
//		System.out.println(boolInput);
//		System.out.print("float");
//		float floatInput = sc.nextFloat();
//		System.out.println(floatInput);
//		System.out.print("double");
//		double doubleInput = sc.nextDouble();
//		System.out.println(doubleInput);
//		
//		System.out.print("word");
//		String wordInput = sc.next();
//		System.out.println(wordInput);
		
		System.out.print("sentence");
		String sentenceInput = sc.nextLine();
		System.out.println(sentenceInput);
		
		System.out.print("char");
		char charInput = sc.next().charAt(0);
		System.out.println(charInput);
		
		sc.close();
	}
}

package Generics;

public class WC {
	public static void printBox(Box<? super Number> box) {//wildcards
		int value=(int)box.getValue();
		System.out.println(value);
	}
	public static void main(String[] args) {
		Box<Number> b1=new Box<>(10);
		printBox(b1);
		
		Box<Object> b2=new Box<>("box..");
		printBox(b2);//exception
	}

}

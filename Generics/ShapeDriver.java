package Generics;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape<Integer,String> s1=new Shape<>(10,"Black");
		int key = s1.getKey();
		String value=s1.getValue();
		System.out.println(key+"\t"+value);
	}

}

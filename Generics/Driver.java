package Generics;

public class Driver {
    public static void main(String[] args) {
    	Box<Integer> b1=new Box<>(10);
    	int value =(int)b1.getValue();
    	System.out.println(value);
    	
    	Box<String> b2=new Box<>("hello");
    	String value2 =b2.getValue();
    	System.out.println(value2);
		
	}

}

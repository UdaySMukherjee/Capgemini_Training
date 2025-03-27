package InstanceOf;

public class Driver {
	public static void main(String[] args) {
		C v = new D();
		if(v instanceof D) {
			System.out.println("D");
		}
        if(v instanceof A) {
			System.out.println("B");
        }
        if(v instanceof A) {
        	System.out.print("A");
        }
        else if(v instanceof C) {
        	System.out.print("C");
        }
        else
        	System.out.print("Invalid");
                
	}

}

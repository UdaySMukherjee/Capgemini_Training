package ExceptionHandling;

public class InvalidAge extends RuntimeException{
	private static String message = "Age is invalid";
	
	InvalidAge(){
		super(message);
	}
	
	InvalidAge(String message){
		super(message);
	}
}

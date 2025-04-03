package ExceptionHandling;

public class IncorrectPin extends RuntimeException{
	public static String message = "Incorrect Pin";
	public IncorrectPin() {
		super(message);
	}
}

package ExceptionHandling;

public class InvalidMoney  extends RuntimeException{
		public static String message = "Enter money as multiple of 500";
		public InvalidMoney() {
			super(message);
		}
	}
}

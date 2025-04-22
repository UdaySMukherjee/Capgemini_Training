package RegexImplementation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		String email = "Smaple@gmail.com";
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher matcher = p.matcher(email);
		
		if(matcher.matches()) {
			System.out.println("valid!");
		}
		else {
			System.out.println("Invalid!");
		}
		
	}

}

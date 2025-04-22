package RegexImplementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDemo {
	public static void main(String[] args) {
		String text = "Call me at 111 222 3333 or 333-222-1111 or 999.999.9999";
		String regex = "\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			String s = matcher.group();
			System.out.println(s);
		}
	}
}

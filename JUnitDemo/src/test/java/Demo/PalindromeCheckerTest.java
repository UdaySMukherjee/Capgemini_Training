package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

	@Test
//	@Disabled
	void testReverse() {
		System.out.println("reverse");
		String expected = "olleh";
		String actual = new PalindromeChecker().reverse("hello");
		assertEquals(expected, actual);
	}
	@Test
	void testPalindrome() {
		System.out.println("palindrome");
		Boolean actual = new PalindromeChecker().isPalindrome("oyo","oyo");
		assertTrue(actual);
	}
	
	@BeforeAll
	public static void m1() {
		System.out.println("before all");
	}
	
	@AfterAll
	public static void m2() {
		System.out.println("after all");
	}
	
	@AfterEach
	public void m3() {
		System.out.println("after each");
	}
	
	@BeforeEach
	public void m4() {
		System.out.println("before each");
	}

}

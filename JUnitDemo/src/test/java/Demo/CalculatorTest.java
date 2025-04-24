package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.*;

class CalculatorTest {

	@Test
	void testAdd() {
		int expected = 30;
		Calculator c = new Calculator();
		int actual = c.add(10, 20);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDiv() {
		Calculator c = new Calculator();00
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
	}

}

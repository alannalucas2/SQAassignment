package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		int expected = 3;
		int actual = calc.add(1,2);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		
		Calculator calc = new Calculator();
		int expected = 14;
		int actual = calc.subtract(16,2);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		int expected = 8;
		int actual = calc.multiply(4,2);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		
		Calculator calc = new Calculator();
		int expected = 3;
		int actual = calc.divide(6,2);
		assertEquals(expected, actual);
		
	}

}

package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorStringTest {
	
	//error handling test

	@Test()
	public void testAddNegative() {
		
		CalculatorString calc = new CalculatorString();
	
		
		calc.add("-8");
		
	}
	
	@Test
	public void addString()
	{
		CalculatorString calc = new CalculatorString();
		
		calc.add("5");
		calc.add("5");
	}
	
	@Test
	public void addString1()
	{
		CalculatorString calc = new CalculatorString();
		
		calc.add("a");
		calc.add("a");
		//This test will fail
	}

}

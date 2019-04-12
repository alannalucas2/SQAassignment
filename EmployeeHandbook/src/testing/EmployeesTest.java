package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//boundary testing
class EmployeesTest {

	int []maxArray = new int[25];
	int []minArray = new int[0];
	
	@Test
	public void checkMaxNumber(){
		Employees numbers = new Employees();
		assertEquals(25, numbers.numberOfEmployees(maxArray));
		
	}
	
	@Test
	public void checkMinNumber(){
		Employees numbers = new Employees();
		assertEquals(minArray.length, numbers.numberOfEmployees(maxArray));
		
	}

}

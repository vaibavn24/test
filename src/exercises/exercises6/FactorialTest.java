package exercises.exercises6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FactorialTest {

	
	//@Test direct below is necessary for
	// the method below it to be run
	// as a unit test
	
	@Test
	public void test() {
		
		assertEquals(1, Factorial.factorial(0));
		assertEquals(1, Factorial.factorial(1));
		assertEquals(6, Factorial.factorial(3));

	}

}

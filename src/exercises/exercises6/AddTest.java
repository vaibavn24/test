package exercises.exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));   ///// I made add a private method, go to Add.java to make it public again so it works
		//
		// write other test cases here:
		//		
		for (int i=0; i<100; ++i) {			
			assertEquals(i, Add.add(0, i));
			assertEquals(i, Add.add(i, 0));
		}
	}
	// you must put a @Test directive before the method
	
	@Test
	public void test2() {
		for (int i = 0; i<100; ++i) {
			for (int j = -100; j<200; ++j) {
				assertEquals(i+j, Add.addAny(i, j));
			}
		}
	}
	@Test
	public void wontwork() { // (won't work until we modify add to addAny, which we did eventually and it now works
		assertEquals(-2, Add.addAny(2, -4));
	}
	
	public void special() {
		assertEquals(-2, Add.addAny(4, -2));
		assertEquals(-2, Add.addAny(2, -4));

	}
	
}

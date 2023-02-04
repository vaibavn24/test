package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest2 {

	@Test
	void test() {

		assertEquals (0, Sum.sum(0));
		assertEquals (1, Sum.sum(1));
		assertEquals (3, Sum.sum(2));
		assertEquals (6, Sum.sum(3));
		assertEquals (10, Sum.sum(4));
		assertEquals (15, Sum.sum(5));
		//
		// recall Gauss's finding
		// 1 + 2 + ... + 99 + 100
		// n/2 pairs of integer that add to n+1
		for (int i =0; i<1000; ++i) {
			int ans = i*(i+1)/2;
			assertEquals(ans, Sum.sum(i));
		}
	}

}
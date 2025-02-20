package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithTest {

	@Test
	void test() {
		Arith a = new Arith();
		assertEquals(11, a.add(5, 6));
//		fail("Not yet implemented");
	}

}

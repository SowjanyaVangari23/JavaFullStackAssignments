package com.insight;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsGreaterThan() {
		assertTrue(c.isGreaterThan(20, 19));
//		fail("Not yet implemented");
	}

	@Test
	void testIsLessThan() {
		assertFalse(c.isLessThan(19, 1));
//		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		assertNull(c.isEmpty(null));
//		fail("Not yet implemented");
	}


}

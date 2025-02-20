package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest {
	Loan l;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		called only once eg. db connection
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
//		called only once eg. db close
	}

	@BeforeEach
	void setUp() throws Exception {
//		for each test case it is executed, objects should be created here - initialization
		l = new Loan();
	}

	@AfterEach
	void tearDown() throws Exception {
//		for each test case it is executed, objects should be nullified
		l = null;
	}

	@Test
	void testGetEmi() {
//		assertEquals(expected val, actual val);
		assertEquals(5000, l.getEmi(60000));
//		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(6, l.sum(3, 3));
//		fail("Not yet implemented");
	}
	
	@Test
	void testDivide() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {l.divide(10, 0);});
		assertEquals("/ by zero", exception.getMessage());
	}

	@Test
	void testDeposit() {
		MyException exception = assertThrows(MyException.class, () -> {l.deposit();});
		assertEquals("Sample exception", exception.getMessage());
	}
	
	

}

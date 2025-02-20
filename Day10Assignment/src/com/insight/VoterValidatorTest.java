package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

class VoterValidatorTest {
	VoterValidator v;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		v = new VoterValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
		v = null;
	}

	@Test
	void testValidateVoterAge() {
		Exception e = assertThrows(Exception.class, () -> {v.validateVoterAge(-3);});
		assertEquals("Invalid age", e.getMessage());
//		fail("Not yet implemented");
	}
	
	@Test
	void testValidateVoterAge1() throws Exception{
		assertEquals(true, v.validateVoterAge(22));
//		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {18, 21, 23, 19, 20, 22})
	void testValidateVoterAge2(int age) throws Exception{
		assertTrue(v.validateVoterAge(age));
//		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {3, 6, 9, 12, 15, 16})
	void testValidateVoterAge3(int age) throws Exception{
		assertFalse(v.validateVoterAge(age));
//		fail("Not yet implemented");
	}
	
	
	

}

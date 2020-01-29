package com.chirag.ctci.string;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.string.UniqueCharValidator;

public class UniqueCharValidatorTest {

	private UniqueCharValidator validator;
	
	@BeforeMethod
	public void beforeMethod() {
		validator = new UniqueCharValidator();
	}
	
	@Test
	public void testNullCase() {
		assertFalse(validator.hasAllUniqueChars(null));
	}
	
	@Test
	public void testEmptyCase() {
		assertFalse(validator.hasAllUniqueChars(StringUtils.EMPTY));
	}
	
	@Test
	public void testDuplicateCharCase() {
		assertFalse(validator.hasAllUniqueChars("abb cd"));
	}
	
	@Test
	public void testDuplicateSpaceCase() {
		assertFalse(validator.hasAllUniqueChars("ab  cd"));
	}
	
	@Test
	public void testValidCase() {
		assertTrue(validator.hasAllUniqueChars("ab cd"));
	}
}

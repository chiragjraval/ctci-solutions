package com.chirag.ctci.string;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.string.RotationValidator;

public class RotationValidatorTest {

	private RotationValidator validator;
	
	@BeforeMethod
	public void beforeMethod() {
		validator = new RotationValidator();
	}
	
	@Test
	public void testAllEmptyCase() {
		assertTrue(validator.isRotation(null, StringUtils.EMPTY));
	}
	
	@Test
	public void testOneEmptyCase() {
		assertFalse(validator.isRotation(null, "abc"));
		assertFalse(validator.isRotation("abc", null));
	}
	
	@Test
	public void testUnequalLengthCase() {
		assertFalse(validator.isRotation("abc", "abcd"));
	}
	
	@Test
	public void testEqualLengthNonRotationCase() {
		assertFalse(validator.isRotation("abc", "bcd"));
	}
	
	@Test
	public void testEqualLengthRotationCase() {
		assertTrue(validator.isRotation("waterbottle", "erbottlewat"));
	}
}

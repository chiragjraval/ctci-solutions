package com.chirag.ctci.string;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.string.PalindromePermutationValidator;

public class PalindromePermutationValidatorTest {

	private PalindromePermutationValidator validator;
	
	@BeforeMethod
	private void beforeMethod() {
		validator = new PalindromePermutationValidator();
	}
	
	@Test
	public void testNullCase() {
		assertTrue(validator.isPalindromePermutation(null));
	}
	
	@Test
	public void testEmptyCase() {
		assertTrue(validator.isPalindromePermutation(StringUtils.EMPTY));
	}
	
	@Test
	public void testPalindromeCase() {
		assertTrue(validator.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void testNonPalindromeCase() {
		assertFalse(validator.isPalindromePermutation("ab  cd"));
	}
}

package com.chirag.ctci.String;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.String.PermutationValidator;

public class PermutationValidatorTest {

	private PermutationValidator validator;
	
	@BeforeMethod
	public void beforeMethod() {
		validator = new PermutationValidator();
	}
	
	@Test
	public void testNullCase() {
		assertTrue(validator.arePermutations(null, StringUtils.EMPTY));
	}
	
	@Test
	public void testAnyEmptyCase() {
		assertFalse(validator.arePermutations("abc", StringUtils.EMPTY));
	}
	
	@Test
	public void testDifferentLengthCase() {
		assertFalse(validator.arePermutations("abc", "bcda"));
	}
	
	@Test
	public void testNonPermutationCase() {
		assertFalse(validator.arePermutations("abcd", "bcde"));
	}
	
	@Test
	public void testPermutationCase() {
		assertTrue(validator.arePermutations("abcd", "bcda"));
	}
	
	@Test
	public void testPermutationWithDuplicatesCase() {
		assertTrue(validator.arePermutations("a bac bd", "bca bd a"));
	}
}

package com.chirag.ctci.String;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StringDistanceCalculatorTest {

	private StringDistanceCalculator distCalculator;
	
	@BeforeMethod
	public void beforeMethod() {
		distCalculator = new StringDistanceCalculator();
	}
	
	@Test
	public void testNullCase() {
		assertEquals(distCalculator.distance(null, null), 0);
	}
	
	@Test
	public void testAnyEmptyCases() {
		assertEquals(distCalculator.distance("abc", null), 3);
		assertEquals(distCalculator.distance(StringUtils.EMPTY, "abc"), 3);
	}
	
	@Test
	public void testNonEmptyCase1() {
		assertEquals(distCalculator.distance("pale", "ple"), 1);
	}
	
	@Test
	public void testNonEmptyCase2() {
		assertEquals(distCalculator.distance("pale", "bake"), 2);
	}
	
	@Test
	public void testNonEmptyCase3() {
		assertEquals(distCalculator.distance("pale", "baked"), 3);
	}
}

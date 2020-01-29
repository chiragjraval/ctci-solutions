package com.chirag.ctci.string;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.string.UrlConvertor;

public class UrlConvertorTest {

	private UrlConvertor convertor;
	
	@BeforeMethod
	private void beforeMethod() {
		convertor = new UrlConvertor();
	}
	
	@Test
	public void testNullCase() {
		assertEquals(convertor.convert(null), null);
	}
	
	@Test
	public void testEmptyCase() {
		assertEquals(convertor.convert(StringUtils.EMPTY), StringUtils.EMPTY);
	}
	
	@Test
	public void testWithoutSpaceCase() {
		assertEquals(convertor.convert("abcd"), "abcd");
	}
	
	@Test
	public void testWithSpaceCase() {
		assertEquals(convertor.convert("Mr abcd efgh"), "Mr%20abcd%20efgh");
	}
}

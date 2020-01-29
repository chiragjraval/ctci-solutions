package com.chirag.ctci.string;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chirag.ctci.string.CharCountCompressor;

public class CharCountCompressorTest {

	private CharCountCompressor compressor;
	
	@BeforeMethod
	public void beforeMethod() {
		compressor = new CharCountCompressor();
	}
	
	@Test
	public void testNullCase() {
		assertNull(compressor.compress(null));
	}
	
	@Test
	public void testEmptyCase() {
		String in = StringUtils.EMPTY;
		assertEquals(compressor.compress(in), in);
	}
	
	@Test
	public void testUncompressableCase() {
		String in = "abcdef";
		assertEquals(compressor.compress(in), in);
	}
	
	@Test
	public void testCompressableCase() {
		String in = "aabcccccaaa";
		String out ="a2b1c5a3";
		assertEquals(compressor.compress(in), out);
	}
}

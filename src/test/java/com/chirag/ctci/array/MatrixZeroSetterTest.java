package com.chirag.ctci.array;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MatrixZeroSetterTest {

	private MatrixZeroSetter setter;

	@BeforeMethod
	public void beforeMethod() {
		setter = new MatrixZeroSetter();
	}

	@Test
	public void testNullCase() {
		int[][] in = null;
		int[][] zeroedIn = setter.setZeros(in);
		assertNull(zeroedIn);
	}

	@Test
	public void testNonZeroCase() {
		int[][] in = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } };
		int[][] zeroedIn = setter.setZeros(in);
		assertTrue(Arrays.deepEquals(zeroedIn, in));
	}
	
	@Test
	public void testZeroCase() {
		int[][] in = new int[][] { { 1, 0, 3 }, { 4, 5, 6 }, { 0, 8, 9 }, { 10, 11, 12 }, { 0, 14, 15 } };
		int[][] out = new int[][] { { 0, 0, 0 }, { 0, 0, 6 }, { 0, 0, 0 }, { 0, 0, 12 }, { 0, 0, 0 } };
		int[][] zeroedIn = setter.setZeros(in);
		assertTrue(Arrays.deepEquals(zeroedIn, out));
	}
}

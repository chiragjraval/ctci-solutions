package com.chirag.ctci.array;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MatrixRotatorTest {

	private MatrixRotator rotator;

	@BeforeMethod
	public void beforeMethod() {
		rotator = new MatrixRotator();
	}

	@Test
	public void testNullCase() {
		int[][] in = null;
		int[][] rotatedIn = rotator.rotate(in);
		assertNull(rotatedIn);
	}

	@DataProvider
	private Object[][] testMatrixSizes() {
		return new Object[][] { { 0 }, { 1 }, { 2 }, { 3 }, { 4 }, { 5 } };
	}

	@Test(dataProvider = "testMatrixSizes")
	public void testNonNullCase(int N) {
		int[][] in = getInputArray(N);
		int[][] out = getOutputArray(N);
		int[][] rotatedIn = rotator.rotate(in);
		assertTrue(Arrays.deepEquals(rotatedIn, out));
	}

	private int[][] getInputArray(int N) {
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = ((i * N) + j + 1);
			}
		}
		return arr;
	}

	private int[][] getOutputArray(int N) {
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = (N - i) + (N * j);
			}
		}
		return arr;
	}
}

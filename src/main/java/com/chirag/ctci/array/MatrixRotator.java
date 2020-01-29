package com.chirag.ctci.array;

import java.util.Objects;

public class MatrixRotator {

	public int[][] rotate(int[][] in) {
		if (Objects.nonNull(in)) {
			int N = in.length;
			if (N > 1) {
				for (int i = 0; i < (N / 2); i++) {
					for (int j = i; j < N - i - 1; j++) {
						int temp = in[i][j];
						in[i][j] = in[j][N - i - 1];
						in[j][N - i - 1] = in[N - i - 1][N - j - 1];
						in[N - i - 1][N - j - 1] = in[N - j - 1][i];
						in[N - j - 1][i] = temp;
					}
				}
			}
		}
		return in;
	}
}

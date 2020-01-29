package com.chirag.ctci.array;

import java.util.Objects;

public class MatrixZeroSetter {

	public int[][] setZeros(int[][] in) {
		if (Objects.nonNull(in)) {
			int N = in.length;
			int M = in[0].length;
			boolean[] rows = new boolean[N];
			boolean[] cols = new boolean[M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (in[i][j] == 0) {
						rows[i] = true;
						cols[j] = true;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				if (rows[i]) {
					for (int j = 0; j < M; j++) {
						in[i][j] = 0;
					}
				}
			}
			for (int j = 0; j < M; j++) {
				if (cols[j]) {
					for (int i = 0; i < N; i++) {
						in[i][j] = 0;
					}
				}
			}
		}
		return in;
	}

}

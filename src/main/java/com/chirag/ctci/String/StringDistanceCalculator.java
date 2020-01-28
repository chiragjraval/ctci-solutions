package com.chirag.ctci.String;

import org.apache.commons.lang3.StringUtils;

public class StringDistanceCalculator {

	public int distance(String in1, String in2) {
		int distance = 0;
		if (StringUtils.isAllEmpty(in1, in2)) {
			distance = 0;
		} else if (StringUtils.isEmpty(in1)) {
			distance = in2.length();
		} else if (StringUtils.isEmpty(in2)) {
			distance = in1.length();
		} else {
			int rows = in1.length() + 1;
			int cols = in2.length() + 1;
			int[][] dist = new int[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == 0) {
						dist[i][j] = j;
					} else if (j == 0) {
						dist[i][j] = i;
					} else if (in1.charAt(i - 1) == in2.charAt(j - 1)) {
						dist[i][j] = dist[i - 1][j - 1];
					} else {
						dist[i][j] = 1 + min(dist[i][j - 1], dist[i - 1][j], dist[i - 1][j - 1]);
					}
				}
			}
			distance = dist[in1.length()][in2.length()];
		}
		return distance;
	}

	private int min(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}
}

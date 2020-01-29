package com.chirag.ctci.string;

import org.apache.commons.lang3.StringUtils;

public class PermutationValidator {

	public boolean arePermutations(String in1, String in2) {
		boolean result = true;
		if (StringUtils.isAllEmpty(in1, in2)) {
			result = true;
		} else if (StringUtils.isAnyEmpty(in1, in2) || in1.length() != in2.length()) {
			result = false;
		} else {
			int[] in1CharCount = new int[512];
			for (int i = 0; i < in1.length(); i++) {
				in1CharCount[in1.charAt(i)]++;
			}
			for (int i = 0; i < in2.length(); i++) {
				in1CharCount[in2.charAt(i)]--;
			}
			for (int i = 0; i < in1CharCount.length; i++) {
				if (in1CharCount[i] != 0) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

}

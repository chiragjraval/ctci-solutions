package com.chirag.ctci.string;

import org.apache.commons.lang3.StringUtils;

public class RotationValidator {

	public boolean isRotation(String in1, String in2) {
		boolean result = false;
		if (StringUtils.isAllEmpty(in1, in2)) {
			result = true;
		} else if (StringUtils.isEmpty(in1) || StringUtils.isEmpty(in2) || in1.length() != in2.length()) {
			result = false;
		} else {
			String in2Whole = in2 + in2;
			result = in2Whole.contains(in1);
		}
		return result;
	}
}

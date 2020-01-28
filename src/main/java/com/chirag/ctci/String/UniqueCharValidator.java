package com.chirag.ctci.String;

import org.apache.commons.lang3.StringUtils;

public class UniqueCharValidator {

	public boolean hasAllUniqueChars(String in) {
		boolean result = true;
		if (StringUtils.isEmpty(in)) {
			result = false;
		} else {
			boolean[] isCharPresent = new boolean[512];
			for (int i = 0; i < in.length(); i++) {
				char c = in.charAt(i);
				if (isCharPresent[c]) {
					result = false;
					break;
				} else {
					isCharPresent[c] = true;
				}
			}
		}
		return result;
	}

}

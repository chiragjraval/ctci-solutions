package com.chirag.ctci.string;

import org.apache.commons.lang3.StringUtils;

public class CharCountCompressor {

	public String compress(String in) {
		String result = in;
		if (StringUtils.isNotBlank(in)) {
			char[] inChars = in.toCharArray();
			StringBuilder resultBuilder = new StringBuilder();
			char prevChar = inChars[0];
			int curCharCount = 1;
			resultBuilder.append(prevChar);
			for (int i = 1; i < inChars.length; i++) {
				if (inChars[i] == prevChar) {
					curCharCount++;
				} else {
					resultBuilder.append(curCharCount);
					prevChar = inChars[i];
					curCharCount = 1;
					resultBuilder.append(prevChar);
				}
			}
			resultBuilder.append(curCharCount);
			String compressedResult = resultBuilder.toString();
			if (compressedResult.length() < result.length()) {
				result = compressedResult;
			}
		}
		return result;
	}
}

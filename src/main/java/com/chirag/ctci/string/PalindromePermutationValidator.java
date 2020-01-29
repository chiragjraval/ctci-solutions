package com.chirag.ctci.string;

import org.apache.commons.lang3.StringUtils;

public class PalindromePermutationValidator {

	public boolean isPalindromePermutation(String in) {
		boolean result = true;
		if(StringUtils.isNotBlank(in)) {
			String inLower = in.toLowerCase().replace(StringUtils.SPACE, StringUtils.EMPTY);
			int[] inCharCount = new int[512];
			for(int i=0; i<inLower.length(); i++) {
				inCharCount[inLower.charAt(i)]++;
			}
			int oddCharCounts = 0;
			for(int i=0; i<inCharCount.length; i++) {
				if(inCharCount[i]%2!=0) {
					oddCharCounts++;
				}
			}
			if(oddCharCounts>1) {
				result = false;
			}
		}
		return result;
	}
	
}

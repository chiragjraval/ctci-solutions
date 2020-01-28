package com.chirag.ctci.String;

import org.apache.commons.lang3.StringUtils;

public class UrlConvertor {

	private static final char SPACE_CHAR = ' ';
	private static final String SPACE_URL_CHAR = "%20";
	
	public String convert(String in) {
		if(StringUtils.isEmpty(in)) {
			return in;
		}
		StringBuilder urlBuilder = new StringBuilder();
		for(int i=0; i<in.length(); i++) {
			if(in.charAt(i) == SPACE_CHAR) {
				urlBuilder.append(SPACE_URL_CHAR);
			} else {
				urlBuilder.append(in.charAt(i));
			}
		}
		return urlBuilder.toString();
	}
	
}

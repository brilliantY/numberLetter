package com.number.util;

import java.util.regex.Pattern;

public class NumberUtil {
	
	private final static Pattern zeroOrOnePattern = Pattern.compile("[0-1]*");
	
	private final static Pattern greater99Pattern = Pattern.compile("\\d{1,2}$");
	
	private final static Pattern digitsPattern = Pattern.compile("[0-9]*");
	
	private final static Pattern arrayPattern = Pattern.compile("[0-9,]*");
	
	public final static int IS_DIGITS = 1;
	
	public final static int IS_NUMBER_ARRAY = 1<<1;
	
	public final static int IS_UNKNOW = 1<<2;
	
	public static boolean isZeroOrOne(String inputString){
		return zeroOrOnePattern.matcher(inputString).matches();
	}
	
	public static boolean isGreater99(String inputString){
		return !greater99Pattern.matcher(inputString).matches();
	}
	
	public static boolean isDigits(String inputString){
		return digitsPattern.matcher(inputString).matches();
	}
	
	public static boolean isNumberArray(String inputString){
		return arrayPattern.matcher(inputString).matches();
	}
	
	public static int judge(String inputString){
		int i = inputString.indexOf(",");
		if(i==-1){
			return digitsPattern.matcher(inputString).matches()?IS_DIGITS:IS_UNKNOW;
		}else{
			return arrayPattern.matcher(inputString).matches()?IS_NUMBER_ARRAY:IS_UNKNOW;
		}
	}
	
}

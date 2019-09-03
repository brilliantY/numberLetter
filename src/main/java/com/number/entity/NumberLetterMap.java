package com.number.entity;

import java.util.HashMap;
import java.util.Map;

public class NumberLetterMap {
	
	public static NumberLetterMap numberLetterMap;
	
	public final static String ZERO_ONE_NOTE = "The 0,1 or their combinations (like 10) do not map to nanny letters";
	public final static String GREATER99_NOTE = "The program do not support converting the digits greater 99 into letters";
	
	private final String[] zero = {};
	private final String[] one = {};
	private final String[] two = {"A" , "B" , "C"};
	private final String[] three = {"D" , "E" , "F"};
	private final String[] four = {"G" , "H" , "I"};
	private final String[] five = {"J" , "K" , "L"};
	private final String[] six = {"M" , "N" , "O"};
	private final String[] seven = {"P" , "Q" , "R" ,"S"};
	private final String[] eight = {"T" , "U" , "V"};
	private final String[] nine = {"W" , "X" , "Y", "Z"};
	
	private NumberLetterMap(){};
	
	public static NumberLetterMap getInstance(){
		if(numberLetterMap==null){
			synchronized(NumberLetterMap.class){
				if(numberLetterMap==null){
					numberLetterMap = new NumberLetterMap();
				}
			}
		}
		return numberLetterMap;
	}
	
	public Map<String,String[]> getLetterMap(){
		Map<String,String[]> letterMap = new HashMap<String, String[]>();
		letterMap.put("0", zero.clone());
		letterMap.put("1", one.clone());
		letterMap.put("2", two.clone());
		letterMap.put("3", three.clone());
		letterMap.put("4", four.clone());
		letterMap.put("5", five.clone());
		letterMap.put("6", six.clone());
		letterMap.put("7", seven.clone());
		letterMap.put("8", eight.clone());
		letterMap.put("9", nine.clone());
		return letterMap;
	}
}

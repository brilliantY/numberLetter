package com.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The program only support the convert the digits from 0 to 9 into letters.
 * When you give it a number bigger than 9,it will throw NullPointerException.
 * I don't know what letters should map to a number that bigger than 9,so I don't finish it.
 * @author 杨志跃
 *
 */
public class NumberUtil {
	
	public static String[]two = {"A" , "B" , "C"};
	public static String[]three = {"D" , "E" , "F"};
	public static String[]four = {"G" , "H" , "I"};
	public static String[]five = {"J" , "K" , "L"};
	public static String[]six = {"M" , "N" , "O"};
	public static String[]seven = {"P" , "Q" , "R" ,"S"};
	public static String[]eight = {"T" , "U" , "V"};
	public static String[]nine = {"W" , "X" , "Y", "Z"};
	public static int n = 0;
	public static Map<Integer,String[]> letterMap;
	
	static{
		letterMap = new HashMap<Integer, String[]>();
		letterMap.put(2, two);
		letterMap.put(3, three);
		letterMap.put(4, four);
		letterMap.put(5, five);
		letterMap.put(6, six);
		letterMap.put(7, seven);
		letterMap.put(8, eight);
		letterMap.put(9, nine);
	}
	
	public static void numberToLetter(int[] numberArray){
		List<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i < numberArray.length; i++) {
			int h = numberArray[i];
			if(h !=0 && h !=1){
				numberList.add(h);
			}
		}
		if(numberList.size()==0){
			System.out.println("The number 0 or 1 do not map to any letters!");
			return;
		}
		if(numberList.size()==1){
			printLetterWhenNumberListIsOne(numberList);
			return;
		}
		String[] letterArray = letterMap.get(numberList.get(0));
		for (int j = 0; j < letterArray.length; j++) {
			String letter = letterArray[j];
			printLetter(letter,numberList, 1);
		}
		//System.out.println(n);
	}
	
	private static void printLetter(String letter,List<Integer> numberList,int sequence){
		if(sequence==numberList.size()){
			return;
		}
		int number = numberList.get(sequence);
		String[] strings = letterMap.get(number);
		if(sequence!=numberList.size()-1){
			for (int i = 0; i < strings.length; i++) {
				String newLetter = letter + strings[i];
				printLetter(newLetter, numberList, sequence+1);
			}
		}else{
			for (int i = 0; i < strings.length; i++) {
				String  newLetter =  letter + strings[i];
				System.out.print(newLetter);
				System.out.print(" ");
				n++;
			}
		}
	}
	
	private static void printLetterWhenNumberListIsOne(List<Integer> numberList){
		int number = numberList.get(0);
		switch (number) {
			case 0 :
			case 1 : System.out.println("The number 0 or 1 do not map to any letters!");	
				break;
			default:printLetterArray(letterMap.get(number));
				break;
		}
	}
	
	private static void printLetterArray(String[] letterArray){
		for (int i = 0; i < letterArray.length; i++) {
			System.out.print(letterArray[i]);
			System.out.print(" ");
		}
	}
	
}

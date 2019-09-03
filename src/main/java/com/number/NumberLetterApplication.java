package com.number;

import java.util.List;
import java.util.Scanner;

import com.number.factory.NumberLetterFactory;
import com.number.method.NumberLetterChange;

public class NumberLetterApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a digits or array.For example 2,3 or 22.");
		System.out.println("When you input A,it will give you a letter array.");
		System.out.println("If you want to exit,you can input Y");
		String inputString = "";
		String next = sc.next();
		while(!next.equals("Y")){
			if(next.equals("A")){
				System.out.println(inputString);
				NumberLetterChange numberLetterChange = NumberLetterFactory.build(inputString);
				List<String> list = numberLetterChange.change();
				System.out.println(list);
				inputString = "";
			}else{
				inputString += next;
			}
			next = sc.next();
		}
		System.out.println("Thank you,Good bye");
		sc.close();
	}
}

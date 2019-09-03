package com.number.method.impl;

import java.util.List;

import org.junit.Test;

public class ArrayLetterChangeTest {
	
	@Test
	public void change(){
		ArrayLetterChange letterChange;
		for (int i = 0; i < 9; i++) {
			letterChange = new ArrayLetterChange(String.valueOf(i)+","+String.valueOf(i+1));
			List<String> list = letterChange.change();
			System.out.println(list);
		}
	}
}

package com.number.method.impl;

import java.util.List;

import org.junit.Test;

public class DigitsLetterChangeTest {


	@Test
	public void change(){
		DigitsLetterChange letterChange;
		for (int i = 0; i <= 99; i++) {
			letterChange = new DigitsLetterChange(String.valueOf(i));
			List<String> list = letterChange.change();
			System.out.println(list);
		}
	}
}

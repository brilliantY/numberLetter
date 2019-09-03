package com.number.method.impl;

import java.util.ArrayList;
import java.util.List;

import com.number.method.NumberLetterChange;

public class UnknowChange implements NumberLetterChange {

	public List<String> change() {
		List<String> unknow = new ArrayList<String>();
		unknow.add("Your input is not a number greater than or equal to 0!");
		return unknow;
	}

}

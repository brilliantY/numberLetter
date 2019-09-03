package com.number.factory;

import org.junit.Assert;
import org.junit.Test;

import com.number.factory.NumberLetterFactory;
import com.number.method.NumberLetterChange;
import com.number.method.impl.DigitsLetterChange;
import com.number.method.impl.UnknowChange;

public class NumberLetterFactoryTest {
	
	@Test
	public void build(){
		String inputString = "2";
		NumberLetterChange build = NumberLetterFactory.build(inputString);
		Assert.assertEquals(true, build instanceof DigitsLetterChange);
		
		inputString = "2,3";
		build = NumberLetterFactory.build(inputString);
		Assert.assertEquals(true, build instanceof NumberLetterChange);
		
		inputString = "abc";
		build = NumberLetterFactory.build(inputString);
		Assert.assertEquals(true, build instanceof UnknowChange);
	}
}

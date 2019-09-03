package com.number.util;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilTest {
	
	@Test
	public void isZeroOrOne(){
		Assert.assertTrue(NumberUtil.isZeroOrOne("1"));
		Assert.assertTrue(NumberUtil.isZeroOrOne("0"));
		Assert.assertTrue(NumberUtil.isZeroOrOne("22"));
	}
	
	@Test
	public void isGreater99(){
		Assert.assertTrue(NumberUtil.isGreater99("100"));
	}
	
	@Test
	public void isDigits(){
		Assert.assertTrue(NumberUtil.isDigits("22"));
	}
	
	@Test
	public void isNumberArray(){
		Assert.assertTrue(NumberUtil.isNumberArray("22"));
	}
	
	@Test
	public void judge(){
		Assert.assertEquals(NumberUtil.IS_DIGITS, NumberUtil.judge("2"));
		Assert.assertEquals(NumberUtil.IS_NUMBER_ARRAY, NumberUtil.judge("2,3"));
		Assert.assertEquals(NumberUtil.IS_UNKNOW, NumberUtil.judge("3f"));
	}
}

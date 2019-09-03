package com.number.entity;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.number.entity.NumberLetterMap;

public class NumberLetterMapTest {

	@Test
	public void getInstance(){
		NumberLetterMap instance1 = NumberLetterMap.getInstance();
		NumberLetterMap instance2 = NumberLetterMap.getInstance();
		Assert.assertNotNull(instance1);
		Assert.assertTrue(instance1==instance2);
	}
	
	@Test
	public void getLetterMap(){
		Map<String, String[]> letterMap = NumberLetterMap.getInstance().getLetterMap();
		Assert.assertNotNull(letterMap);
	}
}

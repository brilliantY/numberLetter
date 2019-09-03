package com.number.method.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.number.entity.NumberLetterMap;
import com.number.method.NumberLetterChange;
import com.number.util.NumberUtil;

/**
 * convert a digits from 0 to 99 into letters
 * @author 杨志跃
 *
 */
public class DigitsLetterChange implements NumberLetterChange {
	
	private String inputString;
	private boolean zeroOrOne = false;
	private boolean greater99 = false;
	
	public DigitsLetterChange(String inputString){
		pretreat(inputString);
	}
	
	private void pretreat(String inputString){
		if(NumberUtil.isZeroOrOne(inputString)){
			zeroOrOne = true;
		}else if(NumberUtil.isGreater99(inputString)){
			greater99 = true;
		}else{
			this.inputString = inputString.replace("0", "").replace("1", "");
		}
	}
	
	public List<String> change() {
		List<String> letterList = new ArrayList<String>();
		if (zeroOrOne) {
			letterList.add(NumberLetterMap.ZERO_ONE_NOTE);
		}else if(greater99){
			letterList.add(NumberLetterMap.GREATER99_NOTE);
		}else{
			change(letterList);
		}
		return letterList;
	}

	private void change(List<String> letterList) {
		Map<String, String[]> letterMap = NumberLetterMap.getInstance().getLetterMap();
		if (inputString.length()==1) {
			String[] letters = letterMap.get(inputString);
			for (int i = 0; i < letters.length; i++) {
				letterList.add(letters[i]);
			}
		}else{
			String[] lettersOne = letterMap.get(inputString.substring(0,1));
			String[] lettersTwo = letterMap.get(inputString.substring(1,2));
			for (int i = 0; i < lettersOne.length; i++) {
				String one = lettersOne[i];
				for (int j = 0; j < lettersTwo.length; j++) {
					letterList.add(one + lettersTwo[j]);
				}
			}
			
		}
	}

}

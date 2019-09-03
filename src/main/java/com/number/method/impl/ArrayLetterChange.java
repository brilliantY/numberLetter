package com.number.method.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.number.entity.NumberLetterMap;
import com.number.method.NumberLetterChange;
import com.number.util.NumberUtil;

public class ArrayLetterChange implements NumberLetterChange {

	private List<String> letterList = new ArrayList<String>();
	
	private boolean greater99 = false;
	
	public ArrayLetterChange(String inputString){
		pretreat(inputString);
	}
	
	private void pretreat(String inputString){
		String[] letterArray = inputString.split(",");
		for (int i = 0; i < letterArray.length; i++) {
			if(NumberUtil.isGreater99(letterArray[i])){
				greater99 = true;
				break;
			}if(!NumberUtil.isZeroOrOne(letterArray[i])){
				letterList.add(letterArray[i]);
			}
		}
	}
	
	public List<String> change() {
		List<String> returnLetterList = new ArrayList<String>();
		if (greater99) {
			returnLetterList.add(NumberLetterMap.GREATER99_NOTE);
		}else if(letterList.size()==0){
			returnLetterList.add(NumberLetterMap.ZERO_ONE_NOTE);
		}else{
			change("",returnLetterList,0,NumberLetterMap.getInstance().getLetterMap());
		}
		return returnLetterList;
	}
	
	private void change(String preLetter,List<String> returnLetterList,int nextIndex,Map<String, String[]> letterMap) {
		if(nextIndex == letterList.size()){
			return;
		}
		String[] letters = letterMap.get(letterList.get(nextIndex));
		if(nextIndex != letterList.size() -1 ){
			for (int i = 0; i < letters.length; i++) {
				change(preLetter + letters[i],returnLetterList,nextIndex+1,letterMap);
			}
		}else{
			for (int i = 0; i < letters.length; i++) {
				returnLetterList.add(preLetter + letters[i]);
			}
		}
	}

}

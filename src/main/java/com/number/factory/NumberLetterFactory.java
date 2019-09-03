package com.number.factory;

import com.number.method.NumberLetterChange;
import com.number.method.impl.ArrayLetterChange;
import com.number.method.impl.DigitsLetterChange;
import com.number.method.impl.UnknowChange;
import com.number.util.NumberUtil;

public class NumberLetterFactory {

	public static NumberLetterChange build(String inputString){
		int judge = NumberUtil.judge(inputString);
		if(judge==NumberUtil.IS_DIGITS){
			return new DigitsLetterChange(inputString);
		}else if(judge==NumberUtil.IS_NUMBER_ARRAY){
			return new ArrayLetterChange(inputString);
		}else{
			return new UnknowChange();
		}
	}
}

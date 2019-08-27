/**
 * 
 */
package org.myjava.coresum.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajani
 *
 */
public class MillionNumberWordConverter implements NumberWordConverter{

	public String convertNumberToWord(int num) {
		
		if(num==0) {
			return "Zero";
		}
		
		List<String> splitNumList = new ArrayList<>();
		getNumberList(splitNumList,num);
		
		String finalNumber = "";
		
		List<String> numberFormat = englishNumberFormat();
		
		for(String numItem:splitNumList) {
			finalNumber = numItem + (numberFormat.size()>0?" "+numberFormat.remove(0):"")+ " "+ finalNumber; 
		}
		
		return finalNumber.trim();
	}

	private void getNumberList(List<String> splitNumList, int num) {
		int divNum = num / 1000;
		int remNum = num % 1000;
		WordGeneratorFromNumberUtil generator = new WordGeneratorFromNumberUtil();
		String numWord = generator.getNumberWord(remNum);
		splitNumList.add(numWord);
		if (divNum > 0) {
			getNumberList(splitNumList, divNum);
		}
			
	}

}

/**
 * 
 */
package org.myjava.coresum.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rajani
 *
 */
public class WordGeneratorFromNumberUtil {

	private Map<Integer, String> secondDigitMap = null;
	private Map<Integer, String> twoDigitMap = null;
	private Map<Integer, String> singleDigitMap = null;

	
	public String getNumberWord(int number) {
		int hundredDigit = number / 100;
		int tenDigit = number % 100;
		int twoDigit = tenDigit / 10;
		int singleDigit = tenDigit % 10;
		String word = "";

		if (hundredDigit != 0) {
			word = getSingleDigitMap().get(hundredDigit) + " Hundred and ";
		}

		if (getTwoDigitMap().get(tenDigit) != null) {
			word = word + getTwoDigitMap().get(tenDigit);
		} else {
			if (twoDigit != 0) {
				word = word + getSecondDigitMap().get(twoDigit) + " " + getSingleDigitMap().get(singleDigit);
			} else {
				word = word + getSingleDigitMap().get(singleDigit);
			}
		}

		return word.trim();
	}

	private Map<Integer, String> getSecondDigitMap() {
		if (secondDigitMap == null) {
			secondDigitMap = new HashMap<>();
			secondDigitMap.put(0, "");
			secondDigitMap.put(2, "Twenty");
			secondDigitMap.put(3, "Thirty");
			secondDigitMap.put(4, "Forty");
			secondDigitMap.put(5, "Fifty");
			secondDigitMap.put(6, "Sixty");
			secondDigitMap.put(7, "Seventy");
			secondDigitMap.put(8, "Eighty");
			secondDigitMap.put(9, "Ninety");
		}
		return secondDigitMap;
	}

	private Map<Integer, String> getTwoDigitMap() {
		if (twoDigitMap == null) {
			twoDigitMap = new HashMap<>();
			twoDigitMap.put(10, "Ten");
			twoDigitMap.put(11, "Eleven");
			twoDigitMap.put(12, "Twelve");
			twoDigitMap.put(13, "Thirteen");
			twoDigitMap.put(14, "Fourteen");
			twoDigitMap.put(15, "Fifteen");
			twoDigitMap.put(16, "Sixteen");
			twoDigitMap.put(17, "Seventeen");
			twoDigitMap.put(18, "Eighteen");
			twoDigitMap.put(19, "Nineteen");
		}
		return twoDigitMap;
	}

	private Map<Integer, String> getSingleDigitMap() {
		if (singleDigitMap == null) {
			singleDigitMap = new HashMap<>();
			singleDigitMap.put(0, "");
			singleDigitMap.put(1, "One");
			singleDigitMap.put(2, "Two");
			singleDigitMap.put(3, "Three");
			singleDigitMap.put(4, "Four");
			singleDigitMap.put(5, "Five");
			singleDigitMap.put(6, "Six");
			singleDigitMap.put(7, "Seven");
			singleDigitMap.put(8, "Eight");
			singleDigitMap.put(9, "Nine");
		}
		return singleDigitMap;
	}

}

/**
 * 
 */
package org.myjava.coresum;

import org.myjava.coresum.exceptions.InvalidInputException;
import org.myjava.coresum.exceptions.OutOfRangeException;
import org.myjava.coresum.util.MillionNumberWordConverter;
import org.myjava.coresum.util.NumberWordConverter;

/**
 * @author Rajani
 *
 */
public class NumberConverterFactory {

	private static final String OUT_OF_RANGE_EXCP = "the entered number %s is out of range!";

	public static String convertNumToWord(String number)
			throws InvalidInputException, OutOfRangeException {

		try {
			NumberWordConverter wordConverter = null;

			if (number.length() == 0 || number.length() > 9) {
				throw new OutOfRangeException(String.format(OUT_OF_RANGE_EXCP, number));
			}

			int inputNum = Integer.parseInt(number);
			
				wordConverter = new MillionNumberWordConverter();
				String wordNumber = wordConverter.convertNumberToWord(inputNum);
				return wordNumber;

			
		} catch (NumberFormatException nfe) {
			throw new InvalidInputException("Invalid Entry Failed with exception" + nfe.getCause());
		}

	}

}

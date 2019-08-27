/**
 * 
 */
package org.myjava.coresum.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.myjava.coresum.NumberConverterFactory;
import org.myjava.coresum.exceptions.InvalidInputException;
import org.myjava.coresum.exceptions.OutOfRangeException;


/**
 * @author Rajani
 *
 */
public class NumberConverterFactoryTest {	
	
	/**
	 * Test method for {@link com.project.test.converter.NumberConverterFactory#process(java.lang.String)}.
	 */
	@Test
	public void convertNumberToWord() {
		String number = "123";
		String expected = "One Hundred and Twenty Three";
		try {
			assertEquals(expected, NumberConverterFactory.convertNumToWord(number));
		} catch (InvalidInputException | OutOfRangeException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(expected=InvalidInputException.class)
	public void testInvalidInputProcess() throws InvalidInputException, OutOfRangeException {
		String number = "abc";
		NumberConverterFactory.convertNumToWord(number);
				
	}
	
	@Test(expected=OutOfRangeException.class)
	public void testOutOfRangeProcess() throws InvalidInputException, OutOfRangeException {
		String number = "9874562131";
		NumberConverterFactory.convertNumToWord(number);
				
	}
	
	

}

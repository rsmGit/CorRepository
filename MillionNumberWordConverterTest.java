/**
 * 
 */
package org.myjava.coresum.test.util;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myjava.coresum.util.MillionNumberWordConverter;


/**
 * @author Rajani
 *
 */
public class MillionNumberWordConverterTest {
	
	static MillionNumberWordConverter converter = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		converter = new MillionNumberWordConverter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		converter = null;
	}

	/**
	 * Test method for {@link com.project.test.converter.service.MillionNumberWordConverter#convertNumberToWord(int)}.
	 */
	@Test
	public void testConvertNumberToWord() {
		int number = 56645781;
		String expectedNumberWord = "Fifty Six Million Six Hundred and Forty Five Thousand Seven Hundred and Eighty One";
		assertEquals(expectedNumberWord, converter.convertNumberToWord(number));
	}
	
	/**
	 * Test method for {@link com.project.test.converter.service.MillionNumberWordConverter#convertNumberToWord(int)}.
	 */
	@Test
	public void testThousandConvertNumberToWord() {
		int number = 65780;
		String expectedNumberWord = "Sixty Five Thousand Seven Hundred and Eighty";
		assertEquals(expectedNumberWord, converter.convertNumberToWord(number));
	}
	
	/**
	 * Test method for {@link com.project.test.converter.service.MillionNumberWordConverter#convertNumberToWord(int)}.
	 */
	@Test
	public void testHundredConvertNumberToWord() {
		int number = 105;
		String expectedNumberWord = "One Hundred and Five";
		assertEquals(expectedNumberWord, converter.convertNumberToWord(number));
	}
	
	/**
	 * Test method for {@link com.project.test.converter.service.MillionNumberWordConverter#convertNumberToWord(int)}.
	 */
	@Test
	public void testZeroDigitConvertNumberToWord() {
		int number = 0;
		String expectedNumberWord = "Zero";
		assertEquals(expectedNumberWord, converter.convertNumberToWord(number));
	}

}

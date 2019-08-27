/**
 * 
 */
package org.myjava.coresum.test.util;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myjava.coresum.util.WordGeneratorFromNumberUtil;

/**
 * @author Rajani
 *
 */
public class WordGeneratorFromNumberUtilTest {
	
	static WordGeneratorFromNumberUtil numberGeneratorUtil = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numberGeneratorUtil = new WordGeneratorFromNumberUtil();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		numberGeneratorUtil = null;
	}

	/**
	 * Test method for {@link com.project.test.converter.service.WordGeneratorFromNumberUtil#getNumberWord(int)}.
	 */
	@Test
	public void testGetNumberWord() {
		int number = 786;
		String expected = "Seven Hundred and Eighty Six";
		assertTrue(numberGeneratorUtil.getNumberWord(number).equals(expected));
	}
	
	/**
	 * Test method for {@link com.project.test.converter.service.WordGeneratorFromNumberUtil#getNumberWord(int)}.
	 */
	@Test
	public void testTwoDigitGetNumberWord() {
		int number = 80;
		String expected = "Eighty";
		assertTrue(numberGeneratorUtil.getNumberWord(number).equals(expected));
	}
	
	/**
	 * Test method for {@link com.project.test.converter.service.WordGeneratorFromNumberUtil#getNumberWord(int)}.
	 */
	@Test
	public void testSingleDigitGetNumberWord() {
		int number = 5;
		String expected = "Five";
		assertTrue(numberGeneratorUtil.getNumberWord(number).equals(expected));
	}

}

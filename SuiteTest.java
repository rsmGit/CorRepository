/**
 * 
 */
package org.myjava.coresum.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.myjava.coresum.test.util.MillionNumberWordConverterTest;
import org.myjava.coresum.test.util.WordGeneratorFromNumberUtilTest;

/**
 * @author Rajani
 *
 */
@RunWith(Suite.class)
@SuiteClasses({NumberConverterFactoryTest.class,MillionNumberWordConverterTest.class,WordGeneratorFromNumberUtilTest.class})
public class SuiteTest {
}
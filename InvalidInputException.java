/**
 * 
 */
package org.myjava.coresum.exceptions;

/**
 * @author Rajani
 *
 */
public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidInputException(String excp) {
		// Call constructor of parent Exception
		super(excp);
	}
}

/**
 * 
 */
package org.myjava.coresum.exceptions;

/**
 * @author Rajani
 *
 */
public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfRangeException(String excp) {
		// Call constructor of parent Exception
		super(excp);
	}

}

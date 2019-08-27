package org.myjava.coresum;

import java.util.Scanner;

import org.myjava.coresum.NumberConverterFactory;
import org.myjava.coresum.exceptions.InvalidInputException;
import org.myjava.coresum.exceptions.OutOfRangeException;

/**
 * @author Rajani
 *
 */
public class App 
{
	  public static void main(String[] args)
    			throws InvalidInputException, OutOfRangeException {
    		System.out.println("Enter the number : ");
    		try (Scanner scanner = new Scanner(System.in)) {
    			String number = scanner.next();

    			String output = NumberConverterFactory.convertNumToWord(number);
    			System.out.println("The output number in english word is : " + output);

    			
    		}
    	}    
}

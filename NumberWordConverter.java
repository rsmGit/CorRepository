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
public interface NumberWordConverter {
	
	public String convertNumberToWord(int num);
	
	public default List<String> englishNumberFormat(){
		List<String> formatList = new ArrayList<>();
		formatList.add("");
		formatList.add("Thousand");
		formatList.add("Million");
		return formatList;
		
	}

}

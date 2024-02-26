package Class5;

import java.util.Arrays;

public class String_Concept_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
	 * to remove spaces from the beginning(before the first character)
	 * 	and end(after the last character) of the String value
	 *  
	 * Method:trim
	 */
		String cityName="   New York City In The ToWN of USA    .";
		String cityNameTrim=cityName.trim();
		System.out.println(cityNameTrim); //New York City In The ToWN of USA    .
		
		/*
		 * to fetch a portion from a string using index value
		 * Method: subString
		 * 
		 * Input only begin index:
		 * 			if beginIndex is valid
		 * 			returns string from beginIndex to end of the string
		 * 			else string index out of bound
		 * 
		 * Input beginIndex and endIndex
		 * 			if beginIndex and endIndex are valid
		 * 			returns string from beginIndex to endIndex-1
		 * 			else string index out of bound
		*/
		cityName="New York City In The ToWN of USA";
		String subFrom10=cityName.substring(10);
		System.out.println("Substring from index 10 to end: "+ subFrom10); //Substring from index 10 to end: ity In The ToWN of USA
		
		String subFrom10to15=cityName.substring(10,15);
		System.out.println("Substring from index 10 to 15: "+subFrom10to15);//Substring from index 10 to 15: ity I (10 to 14)
																			//Input beginIndex and endIndex
		 																	//returns string from befinIndex to endIndex-1
		
		/*
		 * to cut the String value from a specific point to multiple Strings
		 * Method: split()
		 */
		//String cityName="New York City In The ToWN of USA";
		
		cityName="New York City In The ToWN of USA";
		String [] afterSplitBy_o=cityName.split("o"); 
		//shortcut to print array System.out.println(Arrays.toString(afterSplitBy_o)); 
		System.out.println("Array after split from 'o': "+Arrays.toString(afterSplitBy_o)); //[New Y, rk City In The T, WN , f USA]
		
		String[]afterSplitEachCharacter=cityName.split(""); //Array with every character at each index
		System.out.println("Array after split by each character: "+Arrays.toString(afterSplitEachCharacter));
		//[N, e, w,  , Y, o, r, k,  , C, i, t, y,  , I, n,  , T, h, e,  , T, o, W, N,  , o, f,  , U, S, A]
		
		String[]afterSplitBySpace=cityName.split(" "); // split by space
		System.out.println("Array after split by each character: "+Arrays.toString(afterSplitBySpace));
		//[New, York, City, In, The, ToWN, of, USA]
		
	}

}

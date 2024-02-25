package Class5;

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
		 * 			returns string from befinIndex to endIndex-1
		 * 			else string index out of bound
		*/
		cityName="New York City In The ToWN of USA";
		String subFrom10=cityName.substring(10);
		System.out.println("Substring from index 10 to end: "+ subFrom10); //Substring from index 10 to end: ity In The ToWN of USA
		
		String subFrom10to15=cityName.substring(10,15);
		System.out.println("Substring from index 10 to 15: "+subFrom10to15);//Substring from index 10 to 15: ity I (10 to 14)
																			//Input beginIndex and endIndex
		 																	//returns string from befinIndex to endIndex-1
	}

}

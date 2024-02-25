package Class4;

public class String_Concept {

	public static void main(String[] args) {
	
		String cityName="New York City";
                     //  0           12  (index starts with 0)
		/*Length =13
		 * lastIndex =12
		 * lastIndex=Length-1
		 * String is a class.
		 */
		//String methods or Methods available in String class.
		//Method is a set of code to perform a specific task.
		
		System.out.println("City Name= "+cityName);
		/*Calculate the length of a String
		 * Method: length()
		 */
		int cityNameLength=cityName.length();
		System.out.println("Length of city name is: "+cityNameLength);
		
		/*
		 * to convert entire String value in lowercase
		 * Method:toLowerCase()
		 */
		String cityNameInLowerCase=cityName.toLowerCase();
		System.out.println("City Name: "+cityName); //New York City
		System.out.println("City Name in lower case: "+cityNameInLowerCase); //new york city
		
		/*
		 * to convert entire String value in uppercase
		 * Method:toUpperCase()
		 */
		String cityNameToUpperCase=cityName.toUpperCase();
		System.out.println("City Name in upper case: "+cityNameToUpperCase);
		
		/*
		 * For comparison, when we need to verify if two strings are identical
		 * Method:equals()
		 */
		boolean isEqual=cityName.equals(cityNameToUpperCase);
		System.out.println("Is "+cityName+" equals to "+cityNameToUpperCase+":"+isEqual);
		
		/*
		 * For comparison, when we need to verify if two strings have same value 
		 * Method:equalsIgnoreCase()
		 */
		boolean isEqualsIgnoreCase=cityName.equalsIgnoreCase(cityNameToUpperCase);
		System.out.println("Is "+cityName+" equals(Ignore case)to "+cityNameToUpperCase+":"+isEqualsIgnoreCase);
		
		/*
		 * to find a particular sequence is present in the String
		 * Method: contains()
		 */
		boolean isContains_new= cityName.contains("new");
		System.out.println("Does "+cityName+" contain 'new': "+isContains_new);
		
		/*cityName=cityName.toLowerCase();
		boolean isContains_new_IgnoringCases= cityName.contains("new"); //ignoring cases
		System.out.println("Does "+cityName+" contain 'new': "+isContains_new_IgnoringCases);
		*/
		boolean isContains_new_IgnoringCases=cityName.toLowerCase().contains("nEw".toLowerCase());
		System.out.println("Does "+cityName+" contain 'new': "+isContains_new_IgnoringCases);
		
		/*
		 * to replace in String
		 * Method:replace
		 */
		String cityNameReplace_new_old=cityName.replace("New","old");
		System.out.println(cityNameReplace_new_old);
		cityNameReplace_new_old=cityName.replace('N', 'O');
		System.out.println(cityNameReplace_new_old);
		String cityName1=cityName.toLowerCase();
		String cityNameReplace_All=cityName1.replaceAll("y", "x");
		System.out.println(cityNameReplace_All);
		
		/*
		 * to find the char present at which index
		 * Method:charAt();
		 * if given index within the index range, return the char at the index
		 * else it will give String index out of bounds exception.
		 */
		char charAtIndex7=cityName.charAt(7);
		System.out.println("Char at index 7 for cityName is:"+charAtIndex7);
		
		/*
		 * String hello="hello dear, how are you. it's a beautiful day";
		 * 
		 * sout("char at last index is: "+lastIndexChar)
		 */
		String hello="Hello dear, how are you. It's a beautiful day";
		int lastIndexOfString=hello.length()-1;
		System.out.println(lastIndexOfString);
		char lastIndexChar=hello.charAt(lastIndexOfString);
		System.out.println("char at last index is:"+lastIndexChar);
		
		/*
		 * to find the index of a given value
		 * method: indexOf();
		 * if the given string found, it will return the index of first occurrence 
		 * of given value else -1.
		 */
		
		int indexOf_N=cityName.indexOf("n");
		System.out.println(indexOf_N);
		
		cityName="New York City IN the toWN";
		System.out.println(indexOf_N);
		
		//index of multiple word
		int indexOfMultiple=cityName.indexOf("York Ci");//it will return the staring index of the String
		System.out.println(indexOfMultiple);
		
		/*
		 * to find the last index of given value
		 * if the given value found, will return index of the last occurrence
		 * else 
		 * 	return -1
		 * method: lastIndexOf()
		 */
		cityName="New York City In The ToWN of USA";
		int lastIndexOfN=cityName.lastIndexOf("N");
		System.out.println("The last index of 'N' for city name '"+cityName+"' is:"+lastIndexOfN);
		
		/*
		 * To find a string starts with a given a value (index of last occurrence
		 * method: startsWith
		 * 
		 */
		
		boolean cityNameStartsWith_ne=cityName.startsWith("ne");
		System.out.println(cityNameStartsWith_ne);
	
		
		/*
		 * To find a string ends with a given a value
		 * method: endsWith
		 * 
		 */
		System.out.println(cityName);
		boolean cityNameendsWith_ne=cityName.endsWith("toWN");
		System.out.println(cityNameendsWith_ne);
		
		
	}

}

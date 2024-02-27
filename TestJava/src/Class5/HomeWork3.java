package Class5;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	1.display the length of your first name
		 * 	2.Does your last name start with "K" (Ignoring cases)
		 *  3.Print the last alphabet of your first name.
		 *  4.Does my last name ends with "M" (Ignoring cases)
		 */
		
		String myName="Rasel Chowdhury";
		//display the length of your first name
		myName=myName.trim();
		int firstSpace=myName.indexOf(" ");
		String myFirstName=myName.substring(0, firstSpace);
		int len=myFirstName.length();
		System.out.println("My first name is "+myFirstName+" and the length is: "+len);
		//My first name is Rasel and the length is: 5
		
		//Does your last name start with "K" (Ignoring cases)
		int indexOfSpace=myName.lastIndexOf(" ");
		String myLastName=myName.substring(indexOfSpace+1);
		myLastName=myLastName.toUpperCase();
		boolean startsWithK=myLastName.startsWith("K");
		System.out.println("My last name is "+myLastName+". Does my last name start with 'K'=> "+startsWithK);
		//My last name is CHOWDHURY. Does my last name start with 'K'=> false
		
		//Print the last alphabet of your first name.
		int firstNameLength=myFirstName.length();
		char lastChar=myFirstName.charAt(firstNameLength-1);
		System.out.println("My first name is "+myFirstName+" and the last alphabet of my first name is: "+lastChar);
		//My first name is Rasel and the last alphabet of my first name is: l
		
		//Does my last name ends with "M" (Ignoring cases)
		boolean endsWithM=myLastName.endsWith("M");
		System.out.println("My last name is "+myLastName+". Does my last name end with 'M'=> "+endsWithM);
		//My last name is CHOWDHURY. Does my last name end with 'M'=> false
		
		/*
		 * String myStatement="I am a good programmer";
		 * Use String methods to do following tasks:
		 * 1.Display the total number of words in the myStatement
		 * 2.replace all the 'r' characters with 'f' characters
		 */
		String myStatement="I am a good programmer";
		String[]words=myStatement.split(" ");
		int wordCount=words.length;
		System.out.println("Total number of words in-> "+myStatement+" is "+wordCount);
		
		//replace all 'r' character with 'f'haracter
		myStatement.replace('r','f');
		System.out.println(myStatement.replace('r','f'));
		
		/*
		 * Store your first name in a String variable
		 * calculate the length of your first name without length() method from String class
		 *
		 */
		myFirstName="Rasel";
		String[]afterSplit=myFirstName.split("");
		System.out.println("My first name is "+myFirstName+" and the first name length is: "+afterSplit.length);
		//My first name is Rasel and the first name length is: 5
		
		/*
		 * String strNew="Hello dear, how are you";
		 * Assign result (boolean)as true if length is greater than 10
		 * else assign false
		 * Print the result value
		 */
		
		String strNew="Hello dear, how are you";
		int strLen=strNew.length();
		boolean isTrue=strLen>10?true:false;
		System.out.println(strNew+" ->Length of this string->:"+strLen+" is greater than 10-> "+isTrue);
		
		/*
		 * String threeWordsSentence="veRy GooD morNInG";
		 * sout(threeWordsSentence) veRy GooD morNInG
		 * code
		 * sout(threeWordsSentence}//Very Good Morning
		 */
		String threeWordsSentence="haPPy nEw yeAR";
		System.out.println(threeWordsSentence);
		threeWordsSentence=threeWordsSentence.toUpperCase();
		String[]afterSplitBySp=threeWordsSentence.split(" ");
		System.out.println(afterSplitBySp.length);
		String word1=afterSplitBySp[0].substring(0, 1);
		String word2=afterSplitBySp[0].substring(1).toLowerCase();
		System.out.println(word1+word2);
		
		String word3=afterSplitBySp[1].substring(0, 1);
		String word4=afterSplitBySp[1].substring(1).toLowerCase();
		
		String word5=afterSplitBySp[2].substring(0, 1);
		String word6=afterSplitBySp[2].substring(1).toLowerCase();
		System.out.println(word1+word2+" "+word3+word4+" "+word5+word6);
		System.out.println(word1+word3+word5); //Abbreviation HNY
		
		//better way 
		String[]word=threeWordsSentence.split(" ");
		String f1=word[0].substring(0, 1)+word[0].substring(1).toLowerCase();
		String f2=word[1].substring(0, 1)+word[1].substring(1).toLowerCase();
		String f3=word[2].substring(0, 1)+word[2].substring(1).toLowerCase();
		System.out.println(f1+" "+f2+" "+f3);//Happy New Year
		
		String abbr=word[0].substring(0,1)+word[1].substring(0,1)+word[2].substring(0, 1);
		System.out.println(abbr);//HNY
		
		
		
		
		
		
		
		
		
		
		
	}

}

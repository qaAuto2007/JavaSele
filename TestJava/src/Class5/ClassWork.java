package Class5;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement="There could be any value, task is to find the length of the last word in statement";
		String[]statementAfterSplit=statement.split(" ");
		String lastWord=statementAfterSplit[statementAfterSplit.length-1];
		System.out.println(lastWord);
		int lastWordLength=lastWord.length();
		System.out.println("Last word in the statement is-> '"+lastWord+"' and the length is: "+lastWordLength);
		//Last word in the statement is-> 'statement' and the length is: 9
		
		int lastSpace=statement.lastIndexOf(" ");
		String lastWordSubstring=statement.substring(lastSpace+1);
		int lastWordLengthSub_String=lastWordSubstring.length();
		System.out.println(lastWordSubstring);
		System.out.println("Last word in the statement is-> '"+lastWordSubstring+"' and the length is: "+lastWordLengthSub_String);

		

	}

}

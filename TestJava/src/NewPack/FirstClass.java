package NewPack;

public class FirstClass {

	public static void main(String[] args) {
		/** TODO Auto-generated method stub
		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 (Password for gitpush.)
		
		*Numbers (whole/decimal)
		*        whole 
		*        	Byte, short, int, long
		*        Decimal
		*        	float, double
		*
		*alphabets/characters/letters/words/sentences
		*		single letter
		*			char
		*		multi-letters
		*			String
		*
		*yes/no (true/false)
		*		boolean
		*
		*
		*how many datatypes we have in java?
		*In Java, there are two types of datatypes.
		*
		*	1. Primitive
		*		byte, short, int, long, float, double, char, boolean
		*
		*	2. Non-primitive
		*		String, Array, Class, Interface, user define type
		*
		*To store any data, we need variable.
		*
		*Syntax to create variable:
		*
		*datatype variableName = value;
		* 
		*eg: write code to create a byte type variable of any name.
		*
		*	byte testVariable = 10;
		*
		*
		*
		*/ 
		
		//byte is a primitive datatype.
		//can store only whole numbers ranging from -128 to 127
		byte age = 20;
		
		//short is a primitive datatype.
		//can store only whole numbers ranging from -32768 to 32767
		short noOfDaysInYear = 365;
		
		//int is a primitive datatype.
		//can store only whole numbers ranging from -2,147,000,000 to 2,147,000,000
		int usaCovidCases = 9999999;
		
		//Long is a primitive datatype, L is a indicator for long
		//can store only whole numbers ranging from -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
		long worldPopulation=7500000000L;
		System.out.println(worldPopulation);
		
		System.out.println("First Java Project");
		int amount = 100;
		int discount = 10;
		System.out.println("Amount is "+amount +" discount is "+discount);

		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println("Hello World");
		System.out.println(c);
		System.out.print("Hello World");
		System.out.print(c);
		for(int x=0; x<10; x++){
		System.out.println(x);
	}
		for(int x=10; x>0; x--){
			System.out.println(x);
			}
		//Find total number of vowels in a string.
		
		String S="WelCome To Progarmming";
		String str=S.toLowerCase();
		int count=0;
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')){
				count++;}
		}
		System.out.println("Total number of vowels are "+count);
		
		//Find bigger out of 2 number.
		int aa = 10;
		int bb = 20;
		if(aa>bb){
			System.out.println(aa +" is greater");
		}
		else{
			System.out.println(bb +" is greater");
		}
	
	
	System.out.println("This is Rasel" + 11);
	
	
	
	}

}

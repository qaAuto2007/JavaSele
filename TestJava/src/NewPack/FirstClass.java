package NewPack;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//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 (Password for gitpush.)
		// 
		
		System.out.println("First Java Project");

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
	
	
	
	
	
	
	}

}

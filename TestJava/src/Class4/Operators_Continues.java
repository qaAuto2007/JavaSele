package Class4;

public class Operators_Continues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 5. Ternary (?:)
		 * 6. Advanced Assignment (+=. -+. *=. /+. %=)
		 */
		
		/**
		 * Ternary (?:)
		 * 
		 * int var =
		 * 		if credit score>700, then mortgage rate is 3.5
		 * 			else mortgage=4:0
		 * 
		 * Syntax
		 * 	condition?trueValue:falseValue
		 * 
		 */
		int creditScore=670;
		double mortgageRate=creditScore>700?3.5:4.0;
		System.out.println("For credit score "+creditScore+" -- Mortgage rate- "+mortgageRate);
		
		
		int time=11;
		String greetings=time>12?"Good evening":"Good morning";
		System.out.println("Gretting-> "+greetings);
		
		boolean myResult=creditScore>700?true:false;
		System.out.println(myResult);
		
		int myResult1=creditScore>700?time:time++;
		System.out.println(time);
		System.out.println(myResult1);
		
		/*
		 * Assignment Operators (+=, -=, *=. /=,%=)
		 * int num=15;
		 * num+=5 // num=num+5
		 * sout(num)//20
		 */
		int var1=10;
		var1+=5; // var1=var1+5
		System.out.println(var1);
		
		var1-=2;
		System.out.println(var1); // var1=var1-2 //13
		
		var1*=10; //var1=var1*10 //13*10//130
		System.out.println(var1);
		
		var1/=13; //var1=var1/13//10
		System.out.println(var1);
		
		var1%=4; //var1=var1%4//10%4=2
		System.out.println(var1);

	}

}

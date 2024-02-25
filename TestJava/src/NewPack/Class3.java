package NewPack;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * java operators:
		 * 1. Assignment (=)
		 * 2. Arithmetic (=, -, *,  +, /, %, ++, --)
		 * 
		 */
		//Assignment (=)
		int num=10;
		/**
		 * Arithmetic
		 * +
		 * -
		 * *
		 * % modulus
		 * ++ increment (pre-increment/post-increment)
		 * -- decrement (pre-decrement/post-decrement)
		 */
		int num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.println("Num1+Num2= "+num3);//30
		
		int num4=num1+num2+num3;
		System.out.println("Num4= "+num4);//60
		
		num4=num4+num1;
		System.out.println("Num4= "+num4);//70
		
		double dNum=100;
		dNum=dNum+num1; //110.00
		System.out.println("dNum= "+dNum); //110.00
		
		int result=(num1+num2)-(num1-num4)*num2+num3;
		//(10+20)-(10-70)*20+30
		// 30+60*20+30
		//30+1200+30
		System.out.println(result);//1260
		
		// num1=10, num2=20.
		
		int divRes=num2/3;
		System.out.println(divRes); //6 result in int so no decimal point.
		                            // int/int -> int (20/3-->6)
									// double/int -->double
									//int/double -->double
		
	  double divRes1=num2/3.0;
	  System.out.println(divRes1); //6.6666666666666667
	  
	  
	  //Modulus
	  // 20/3 -->6 and remainder is 2 (modulus is the remainder)
	  // 40/5 -->8 and remainder is 0
	  // 11/4 -->2 and remainder 3
	  
	  System.out.println("40 % 5 --> "+40%5); //0
	  System.out.println("20 % 3 --> "+20%3); //2
	  System.out.println("11 % 4 --> "+11%4); //3
	  
	  /**
	   * increment (++)
	   * int b=10;
	   * b++ -> post increment
	   * ++b -> pre-increment
	   * ++ increment the current value of variable by 1
	   * and store new value in the same variable
	   * 
	   * 
	   */
	  int inc=10;
	  System.out.println(inc); //10
	  inc++;
	  System.out.println(inc);//11
	  ++inc;
	  System.out.println(inc);//12
	  
	  /**
	   * post -> use the current value of variable, then increment
	   * pre -> increment the value of variable, then use
	   */
	  
	  System.out.println(inc++); //12 //(post increment)
	  System.out.println(++inc); //14 // (Pre increment)
	  
	  int ab=5;
	  System.out.println(ab++); // 5
	  System.out.println(++ab); // 7
	  System.out.println(ab);   // 7
	  System.out.println(ab++); // 7
	  System.out.println(ab);   // 8
	  System.out.println(ab++); // 8
	  System.out.println(++ab); // 10
	  System.out.println(ab);   // 10
	  
	  /**
	   * decrement (--)
	   * int b=10;
	   * b-- -> post decrement
	   * --b -> pre-decrement
	   * -- decrement the current value of variable by 1
	   * and store new value in the same variable
	   */
	  
	  int b=15;
	  System.out.println(b--); // 15
	  System.out.println(--b); // 13
	  System.out.println(b);   // 13
	  System.out.println(b--); // 13
	  System.out.println(b);   // 12
	  System.out.println(b--); // 12
	  System.out.println(--b); // 10
	  System.out.println(b);   // 10
	  
	  /**
	   * Comparison Operators
	   * (>, <, >=, <=, !=)
	   * 
	   * Result of any comparison operation is always boolean
	   */
	  int com1=5;
	  int com2=7;
	  
	  boolean com1GrCom2=com1>com2;
	  System.out.println(com1 +" > " +com2 +" = "+com1GrCom2);
	  
	  boolean com1LeCom2=com1<com2;
	  System.out.println(com1+" < "+com2+ " = " +com1LeCom2);
	  
	  boolean com1GrEqCom2=com1>=com2;
	  System.out.println(com1+" >= "+com2 +" = "+com1GrEqCom2);
	  
	  boolean com1LeEqCom2=com1<=com2;
	  System.out.println(com1LeEqCom2);
	  
	  boolean com1EqCom2=com1==com2;
	  System.out.println(com1 +" == " +com2 +" = "+com1EqCom2);
	  
	  /**
	   * Logical (&&, ||, !)
	   * && -> and operator
	   * || -> or operator
	   * ! -> not operator
	   * 
	   * We use logical operators to join two or more conditions
	   * final result would be boolean datatype
	   * 
	   * if day==monday and raining==false and time>9 and hangover==false
	   * 	then i'll go to office

	   */
	  int lVar1=10, lVar2=20, lVar3=30, lVar4=40;
	  boolean lRes1=lVar1<=lVar3 && (lVar2==(lVar4-lVar1-lVar1));
	  System.out.println(lRes1);
	  
	  int lVar11=10, lVar12=20, lVar13=30, lVar14=40;
	  boolean lRes2=(lVar11<=lVar13 || (lVar12==(lVar14-lVar11-lVar11)));
	  System.out.println(lRes2);
	  
	  double fTemp=68;
	  // cT=(fT-32)*(5/9) formula
	  double cTemp=(fTemp-32)*(5.0/9); //convert F to C
	  System.out.println(fTemp+" in fahrenheit = "+cTemp+" degree In celcius");
	  
	  //find the given number is even
	  int num7=11;
	  if(num7%2==0){
		  System.out.println(num7+" is an Even number");
	  }else{
		  System.out.println(num7+" is an Odd number");
	  }
	  
	  num7=13;
	  boolean isEven=false;
	  int remainder=num7%2;
	  isEven=remainder==0;
	  System.out.println("Is "+num7+" is even: "+isEven);
	  
	  
		  
	  
	  
		

	}

}

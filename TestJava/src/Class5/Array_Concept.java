package Class5;

import java.util.Arrays;

public class Array_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Array([]):
		 * 
		 * It's a non-Primitive dataType
		 * dataType which van store multiple values of SAME dataType
		 * 
		 * Things to know before creating an Array.
		 * 1. what dataType of values I would like to store
		 * 2.Total number of values I would like to store
		 * 		     OR
		 * 	     All the values that need to be stored in array
		 * 
		 * Syntax to create an Array	
		 * dataType [] arrName=new dataType[totalValueCount];
		 *         OR
		 *         dataType[]arrName={value1, value2, value3, value4,value5};
		 * 
		 */
		double []myBills=new double[5];
		
		//Array ->{ , , , , }
		//index -> 1, 1, 2, 3, 4
		
		myBills[0]=100.09; //storing value in myBills-index 0
		myBills[4]=4.4;
		myBills[1]=41.1;
		myBills[2]=4.2;
		myBills[3]=3.4;
		System.out.println(Arrays.toString(myBills));
		System.out.println(myBills[4]);
		
		//store the value at index-2 in new variable (foodBill)
		double foodBill=myBills[2];//
		
		//change the value at index-4;
		//new value should be total of index-0,1,2,3
		myBills[4]=myBills[0]+myBills[1]+myBills[2]+myBills[3];
		System.out.println(myBills[4]);
		
		//find the length of a array
		//length - is a variable in array not a method.
		
		int lengthOfArray=myBills.length;
		System.out.println(lengthOfArray);
		
	}

}

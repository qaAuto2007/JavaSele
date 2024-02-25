package Class5;

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
		
	}

}

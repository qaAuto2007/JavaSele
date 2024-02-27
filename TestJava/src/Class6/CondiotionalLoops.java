package Class6;

public class CondiotionalLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * Conditional Loops (Conditional Code)
	 * 1. if-else
	 * 2. switch
	 */
		
	 /*
	  * if (condition(s)){
	  *   // if
	  *   // block
	  * 
	  * }else{
	  * 	// else
	  * 	// block
	  * }
	  * 
	  */
		/*
		 * days=weekend; clothes=casual
		 * days=weekdays and meeting=false; clothes=formals
		 * days=weekdays and meeting=true; clothes=suit
		 */
		
		String days="weekend";
		boolean anyMeetings=false;
		String clothes="";
		
		if(days.equalsIgnoreCase("weekdays")&& anyMeetings==false){
		
			clothes="formals";	}
		else if(days.equalsIgnoreCase("weekdays") && anyMeetings==true){
			clothes="suit";
		}
		else{
			clothes="casual";
		}
		System.out.println(clothes);
		
		/*
		 * print "Even" if the value in num is even
		 */
		
		int num=10;
		if(num%2==0){
			System.out.println("Even");
		}
		
		String name="Happypeaceber";
		boolean result=true;
		int number=22;
		
		/*
		 * if name length is greater than 10 and number is greater than5
		 * print the below:
		 * 			name in all uppercase
		 * 			and replace p with b in name
		 * else 
		 * make result false.
		 */
		if(name.length()>10 && number>5){
			System.out.println(name.toUpperCase());	
			System.out.println(name.replace('p', 'b'));
			
		}
		else{result=false;
		
		}
		System.out.println(result);
		
		/*
		 * name
		 * 		if name ="Happy"
		 * 				do this
		 *      else if name="peace"
		 *      		do this
		 *      else if name="grow"
		 *      		do this
		 * 
		 * 
		 * switch (variable){
		 * 			case value1:
		 * 				//do this 
		 * 				//code if variable is equal value 1
		 * 			break;
		 * 
		 * 			case value2:
		 * 				//do this 
		 * 				//code if variable is equal value 1
		 * 			break;
		 * 
		 * 			Case value3:
		 * 			    //do this 
		 * 				//code if variable is equal value 1
		 * 			  break;
		 * 			default:
		 * 				//do this 
		 * 				//code if variable is NOT matching any cases
		 * 
		 * }
		 */
		
		/*
		 * dayName=monday; print "day 1"
		 * 
		 */
		String dayName="tuesday";
		
		switch(dayName.toUpperCase()){
		case "MONDAY":
			System.out.println("Day 1");
			break;
			
		case "TUESDAY":
			System.out.println("Day 2");
			break;
			
		case "WEDNESDAY":
			System.out.println("Day 3");
			break;
			
		case "THURSDAY":
			System.out.println("Day 4");
			break;
			
		case "FRIDAY":
			System.out.println("Day 5");
			break;
			
		case "SATURDAY":
			System.out.println("Day 6");
			break;
			
		case "SUNDAY":
			System.out.println("Day 7");
			break;
			default:
				System.out.println("Invalid Day");
				break;
				
		
		
		}
		
		String monthName="october";
		
		switch(monthName.toLowerCase()){
		case "january":
		case "february":
		case "december":
			System.out.println("winter");
			break;
			
		case "april":
		case "may":
		case "march":
			System.out.println("spring");
			break;
			
		case "july":
		case "august":
		case "june":
			System.out.println("summer");
			break;
			
		case "september":
		case "october":
		case "november":
			System.out.println("fall");
			break;
			
		default:
			System.out.println("Invalid month");
			break;
			
			
		
		
		
		
		}
		
		
		}
		
		
		
		
		
	}
	

			
		
		
		
		
	



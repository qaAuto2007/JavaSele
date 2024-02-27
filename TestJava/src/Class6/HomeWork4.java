package Class6;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create variable to store student-score and total-possible-score;
		 * Based on the percentage, display grade yto student
		 * Grade A: 91-100
		 * Grade A: 81-90
		 * Grade A: 71-80
		 * Grade A: 61-70
		 * Grade less than or equal to 60
		 * 
		 */
		
		double studentScore=120.00;
		double maxScore=160.00;
		//your percentage is XX.yy and your grade is:A
		double percentage=(studentScore/maxScore)*100;
		if(percentage>90){
			System.out.println("Your percentage is: "+percentage+" and grade is:A");
		}else if(percentage>80 && percentage<=90 ){
			System.out.println("Your percentage is: "+percentage+" and grade is:B");
		}if(percentage>70 &&percentage<=80){
			System.out.println("Your percentage is: "+percentage+" and grade is:C");
		}if(percentage>60 && percentage <=70){
			System.out.println("Your percentage is: "+percentage+" and grade is:D");
		}else if(percentage <=60){
			System.out.println("Your percentage is: "+percentage+" and grade is:F");
		}
		
		/*
		 * Store value in an int variable
		 * if number is divisible by 3, print divisible by 3
		 * if number is divisible by 5, print divisible by 5
		 * if number is divisible by 3 and 5,  print divisible by both
		 * if number is not divisible by 3 or 5, print the number
		 */
		
		int num=45;
		if(num%3==0 && num%5!=0){
			System.out.println("Divisible by 3");
			}else if(num%5==0 && num%3!=0){
			System.out.println("Divisible by 5");
		    }else if(num%3==0 && num%5==0){
		    	System.out.println("Divisible by both");
		}else{System.out.println(num);
		}
		
		/*
		 * Checking car gear (P, D, N, R)  //switch
		 * if car gear is P and "you can park car"
		 * if the car gear is D 
		 * 				if drive mode is snow, display "you are on Snow mode"
		 * 				if drive mode is sport, display "you are on Sport mode"
		 *			    if drive mode is eco, display "you are on Eco mode"
		 *if car gear is N, display "put car in a car wash"
		 *if car gear is R, display "reverse the car"
		 */
		String gear="d";
		String cMode="eco";
		switch(gear.toUpperCase()){
		case "P":
			System.out.println("You can park the car");
			break;
		case "D":
			if(cMode.toUpperCase().equals("SNOW")){
				System.out.println("You are on Snow mode");
				}else if(cMode.toUpperCase().equals("SPORT")){
					System.out.println("You are in Sport mode");
				}else{
					System.out.println("You are Eco mode");
				}
			break;
		case "N":
			System.out.println("Put car in a car wash");
			break;
		case "R":
			System.out.println("reverse the car");
			break;
		default:
			System.out.println("Invalid Day");
			break;
			
			
		
		
		
		}
		

	}
}



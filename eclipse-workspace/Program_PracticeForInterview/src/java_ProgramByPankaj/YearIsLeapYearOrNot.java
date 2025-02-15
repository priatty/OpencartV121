package java_ProgramByPankaj;

import java.util.Scanner;

public class YearIsLeapYearOrNot {
	
	
	
	/*Leap Year is an year having 366 days, while the normal year has 365 days.
	 If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
	 If the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it as Leap year.*/
	//year is leap year if it is divisible by 4 and not divisible by 100 or year divisible by 400
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scanner.nextInt();
        
        if( ((year%4==0) && (year%100 != 0)) || (year%400 ==0))
        		
        		{
        	
        	System.out.println("The year is Leap Year");
        }else {
        	
        	System.out.println("It is common year");
        }
        
      

	
	/*if ( ((year%4==0) && (year%100 != 0)) || (year%400 ==0)) {
		
		System.out.println("Leap Year");
	}else {
		
		System.out.println("Common year");
	}*/


}
}
package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java Program to check whether the given number is a palindrome

Step 1 : Intake the NUmber from user
Step 2 : Reverse the Given Number
Step 3 : Compare Original With Given  eg1991
*/


public class NumberIsPalindomeOrNot {

	public static void main(String[] args) {
	 
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter Any Number");
		     int originalNumber = sc.nextInt();
		     
		     int reversedNumber = 0;
		     
		     while(originalNumber!=0) {
		    	 
		    	 int remainder = originalNumber%10;
		    	 reversedNumber = (reversedNumber*10)+remainder;
		    	 originalNumber = originalNumber/10;
		    	 
		     }

		     System.out.println(reversedNumber);
		     
		    if(reversedNumber==originalNumber) {
		    	
		    	System.out.println("Entered Number is Palindome");
		    }else
		    {
		    	System.out.println("Entered Number is not Palindome");
		    }
	}

}

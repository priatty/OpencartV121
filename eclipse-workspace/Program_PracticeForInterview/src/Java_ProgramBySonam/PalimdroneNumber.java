package Java_ProgramBySonam;

import java.util.Scanner;

public class PalimdroneNumber {

	public static void main(String[] args) {
		
		//Step 1 : Logic for Intake the NUmber from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any Number : "); //1991
		int originalNumber=scanner.nextInt();
		scanner.close();
	    int number=originalNumber;
	    
 int reversedNumber=0;
	    
	    // Step 2 : Logic for Reversing  the Given Number
	    while(number!=0)
	    {
	    	int remainder=number%10;
	    	reversedNumber=(reversedNumber*10)+remainder;
	    	number=number/10;
	    }
	    // Step 3 : Compare Original With Given            Checking whether number is palindrome or not
	    if(originalNumber==reversedNumber)
	    {
	    	System.out.println(originalNumber+" is a Palindrome");
	    }else
	    {
	    	System.out.println(originalNumber+" is not a Palindrome");
	    }
		
		
	}
	}



	   
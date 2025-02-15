package java_ProgramByPankaj;

import java.util.Scanner;

public class Num_EvenOrOdd {
	
	/*
	 Java program to check whether the given input number is even or odd
	 
	 Output:
	Input your number:
	4
	Given number 4 is an even number


	nextint() : Scans the next token of the input as an int. 
	Returns:the int scanned from the input

	InputMismatchException - if the next token does not match the Integerregular expression, or is out of range
	NoSuchElementException - if input is exhausted
	IllegalStateException  - if this scanner is closed
	 */



		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Any Number : ");
			int num=scanner.nextInt(); //This Method will collect number
			//scanner.close(); //we can write here also
			
			//Write the logic for checking whether the number entered by user is even or odd number
		    if(num%2==0)
		    {
		    	System.out.println("The Given Number "+num+" is an Even Number");
		    }
		    else
		    {
		    	System.out.println("The Given Number "+num+" is Odd Number");
		    }
		    scanner.close(); //we can write here also
		}
	}



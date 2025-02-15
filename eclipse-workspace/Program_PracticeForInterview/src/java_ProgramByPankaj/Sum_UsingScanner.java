package java_ProgramByPankaj;

import java.util.Scanner;

public class Sum_UsingScanner {

	/*
	 Java Program for intaking two numbers using Scanner and printing their sum
	 
	 Output:

	Enter first number:
	9
	Enter second number:
	5
	The sum of two given numbers is: 14
	 
	 */
		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);       //Here Scanner() constructor must not be empty  and we take input from user
			
			System.out.println("Enter First Number :");
			int firstNumber = scanner.nextInt();
			System.out.println("Enter Second Number :");
			int secondNumber=scanner.nextInt();
			scanner.close();                             //Here we not write this code then warning in yellow colours display ,if use then warning gones
			System.out.println("The Sum of "+firstNumber+" and "+secondNumber+" is: "+(firstNumber+secondNumber));
			
		}

	}

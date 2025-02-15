package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java program which intakes two numbers and finds the quotient and reminder

What is Quotient?
Two Numbers : 4 2
4/2 =2  Here Quotient is 2 and Remainder is 0
6/2 =2  Here Quotient is 3 and Remainder is 0
5/2 =2  Here Quotient is 2 and Remainder is 1 
*/

public class Find_QuotientAndReminder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fNumber");
		int fNum  = sc.nextInt();
		System.out.println("Enter SecNumber");
		int secNum = sc.nextInt();
		
		System.out.println("Quotient is " + (fNum/secNum));
		System.out.println("Reminder is" + (fNum%secNum));
		
		

	}

}

package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java program to find the sum of all the digits in the inputed number

5124   5+1+2+4 

5124%10  remainder will be 4 ,after that divide
5124/10  quotient  will be 512

512%10   remainder will be 2
512/10   Quotient will be 51

 51%10   remainder will be 1
51/10   Quotient will be 5

5%10   remainder will be 5
5/10   Quotient will be 0

Untill the Quotient become zero ,repeat this process
*/

public class SumOfAllDigits_ofAInputedNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Digit Number ");
		int number =sc.nextInt();
		int sum =0;
		while(number!=0) {
			
			int remainder= number%10;
			sum= sum+remainder;
			number = number/10;
			
			
		}
		
		System.out.println("Sum of all digit = "  + sum );

	}

}

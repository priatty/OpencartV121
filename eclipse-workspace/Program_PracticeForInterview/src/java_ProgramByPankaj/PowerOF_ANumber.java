package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java program to find the power of a number
 
 
number
5 Power 3 means 5*5*5=125 

means x raised to y 
*/


public class PowerOF_ANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int number = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		int mult=1;
		for (int i=1 ; i<=power ;i++) {
			
		mult  = mult*number;
		}
		
		System.out.println(mult);
	}

}

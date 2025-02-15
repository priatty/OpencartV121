package java_ProgramByPankaj;

import java.util.Scanner;

//fibonacci means every number is addition of previous two numbers
	//ex. 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377  ....15 times
	

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		int c;
		int i = 1;
		while(i<= 15) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(a);
			i++;
			
			
		}
			

	}

}

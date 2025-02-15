package java_ProgramByPankaj;

import java.util.Scanner;

//e.g fact of 5 = 5*4*3*2*1
public class FactorialOfNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int fact = 1;
		while(num>=1) {
			
			fact = fact*num;
			num--;
			
		}
		
		System.out.println("Factorial of" +num + " is  : " + fact  );

	}

}

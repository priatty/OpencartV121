package java_ProgramByPankaj;

import java.util.Scanner;

public class MaxOfNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		int a= sc.nextInt();
		System.out.println("Input Second number");
		int b= sc.nextInt();
		System.out.println("Input Third number");
		int c= sc.nextInt();
		int max = a;
		
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		System.out.println(max);
		
	}

}

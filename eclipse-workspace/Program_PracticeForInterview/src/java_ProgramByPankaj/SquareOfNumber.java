package java_ProgramByPankaj;

import java.util.Scanner;

/*
 Java Program to find the Square of the given number
 */
public class SquareOfNumber {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Any Number : ");
	int num=scanner.nextInt();
	scanner.close();
	
	System.out.println("Square of the given number is : "+(num*num));
}
}



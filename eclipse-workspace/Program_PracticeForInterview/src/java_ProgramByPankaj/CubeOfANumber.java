package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java program to find the Cube of the given number
*/
public class CubeOfANumber {
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Any Number : ");
			int num=scanner.nextInt();
			scanner.close();
			
			System.out.println("Cube of the given Number : "+(num*num*num));
		}
		
	}



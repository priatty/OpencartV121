package java_ProgramByPankaj;

import java.util.Scanner;

public class ToPrintMultTable {
	/* 
	 
	Java program which prints the multiplication table of the given input number
	 
	 
	*/
	

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Any Number : ");
			int num=scanner.nextInt();
			scanner.close();
			//Multiplication table  of the given input number
			//int mult=0;
			for(int i=1;i<=10;i++)
			{
			//mult = num*i;
			//System.out.println(mult);
				System.out.println(num+"*"+i+"="+(i*num));
			}
		}
	}



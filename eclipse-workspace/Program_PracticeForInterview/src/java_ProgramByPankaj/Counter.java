package java_ProgramByPankaj;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		
		/*
		 Java program to print the number of letters, digits, spaces and other things in the inputted statement
		 
		 Output:
		 Enter any statement having characters,numbers,spaces and symbols:
		$%# are the 3 Symbols
		Number of letters is: 13
		Number of digits is: 1
		Number of spaces is: 4
		Number of other things is: 3
		 */
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any statement having characters,numbers,spaces and symbols:");
       String str =  sc.nextLine();
       int letterCount = 0;
       int digitCount = 0;
       int spaceCount = 0;
       int otherCount = 0;
      
       char[] ca = str.toCharArray();
      
       for(Character c : ca) {
             
              if(Character.isLetter(c)) {
                   
                    letterCount++;             
                   
             } else if(Character.isDigit(c)) {
                   
                    digitCount++;
                   
             } else if(Character.isSpaceChar(c)) {
                   
                    spaceCount++;
                   
             } else {
                   
                    otherCount++;
                   
             }
      
      }
      
      System.out.println("Number of letters is: "+letterCount);
      System.out.println("Number of digits is: " +digitCount);
      System.out.println("Number of spaces is: " +spaceCount);
      System.out.println("Number of other things is: "+otherCount);

  	
  }
  


	}


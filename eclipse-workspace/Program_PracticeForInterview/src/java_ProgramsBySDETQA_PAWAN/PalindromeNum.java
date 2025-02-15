package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input A Number ");
		int num = sc.nextInt();
		int originalNum = num;
		int rev = 0;
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num= num/10;
		}
		
      System.out.println("Reversed Number is - " + rev);
      
      if(rev == originalNum) {
    	  
    	  System.out.println( rev + "Number is palidrome number  ");
      }else {
    	  
    	  System.out.println(rev + "Number is not a palindrome number");
      }
	}

}

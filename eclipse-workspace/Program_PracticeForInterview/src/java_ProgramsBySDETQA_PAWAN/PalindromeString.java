package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A String");
  	    String str = 	sc.nextLine();
  	    String originStr = str;
	    String newString ="";
		
		char[] arr = str.toCharArray();
		for (int i = arr.length-1 ; i>=0 ; i--) {
			
			newString = newString + arr[i];
		}
		
		System.out.println(newString);
		
		if(newString.equals(originStr)) {
			
			System.out.println("Entered String is Palindrone");
			}
		else {
			
			System.out.println("Entered String is not Palindrone");
		}


	
}
}

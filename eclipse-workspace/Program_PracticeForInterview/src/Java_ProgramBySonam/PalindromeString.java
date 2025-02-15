package Java_ProgramBySonam;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sc.nextLine();
		
		String newString ="";
		
		char[] ch = str.toCharArray();
		for (int i = ch.length-1 ; i>=0 ; i--) {
			
			newString = newString + ch[i];
		}
		
		System.out.println(newString);
		
		if(newString.equals(str)) {
			
			System.out.println("Entered String is Palindrone");
			}
		else {
			
			System.out.println("Entered String is not Palindrone");
		}

	}
	
}


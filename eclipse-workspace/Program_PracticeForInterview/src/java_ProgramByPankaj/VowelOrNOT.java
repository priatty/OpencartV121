package java_ProgramByPankaj;

import java.util.Scanner;

public class VowelOrNOT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char letter = sc.nextLine().charAt(0);
		
		switch(letter) {
		
		case 'a' : System.out.println("Vowel");
		break;
		
		case 'e' : System.out.println("Vowel");
		break;
		

		case 'i' : System.out.println("Vowel");
		break;
		

		case 'o' : System.out.println("Vowel");
		break;
		

		case 'u' : System.out.println("Vowel");
		break;
		

		case 'A' : System.out.println("Vowel");
		break;
		
		

		case 'E' : System.out.println("Vowel");
		break;
		

		case 'I' : System.out.println("Vowel");
		break;
		

		case 'O' : System.out.println("Vowel");
		break;
		

		case 'U' : System.out.println("Vowel");
		break;
		
	
		default:System.out.println("It is some other symbol");

		}
				

	}

}

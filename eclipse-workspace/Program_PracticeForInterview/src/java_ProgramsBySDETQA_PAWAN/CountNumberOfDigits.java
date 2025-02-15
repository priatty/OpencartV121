package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Any Number");
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			
			n= n/10;
			count++;
		}
			
			System.out.println(count);

	}

}

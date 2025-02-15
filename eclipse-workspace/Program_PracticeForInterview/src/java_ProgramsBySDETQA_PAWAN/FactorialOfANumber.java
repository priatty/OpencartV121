package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number to calculate factorial ");
			int n = sc.nextInt();
			long fact= 1;
			for(int i=1; i<=n; i++) {
				
				fact = fact*i;
			}
			
			System.out.println("Facorial of " + n + " is =" + fact);
	}

}

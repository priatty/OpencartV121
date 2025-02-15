package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;
 
//for prime number Condition 1# Number should be greater than 1
//condition to i can have only two factors i.e 1 and number itself
//Example:
//19 - factor are 1 and 19
//28 - 1,2,4,7,14,28
public class Number_Is_PrimeNumber {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter A number");
				int n = sc.nextInt();
				int count=0;
				if(n>1) {
					
					for(int i=1; i<=n; i++) {
						
						if(n%i == 0) 
							count++;               //if count becomes more than two it will not prime number 
					}
					if(count == 2) {
						
						System.out.println("Number is prime number");
						
					}else {
						
						System.out.println("Number is not Prime Number");
					}
					
				}else {
					
					System.out.println("Number is not a prime number");
				}
	}

}

package java_ProgramsBySDETQA_PAWAN;

public class AddtitionOfDigitsInANum {

	public static void main(String[] args) {
		  
		
		int n = 12345;
		int sum = 0;
		while(n>0) {
			
			//int reminder = n%10; 
			//or
			
			sum= sum+n%10;
			n = n/10;
		}
		
		System.out.println("Sum of all digits in a number is  " + sum);

	}

}

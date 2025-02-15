package java_ProgramsBySDETQA_PAWAN;

import java.util.Random;

public class HowToGenerateRandomNumbersAndString {

	public static void main(String[] args) {
		
		// Approach1
		Random rand = new Random();
		int rand_int = rand.nextInt(10);               // every time i will gives random number we can use different parameter limit is 999
		System.out.println(rand_int);
		boolean rand_boolean = rand.nextBoolean();
		System.out.println(rand_boolean);
		double rand_dbl =rand.nextDouble();	
		System.out.println(rand_dbl);
		
		//Approach2
		
		System.out.println(Math.random());

	}

}

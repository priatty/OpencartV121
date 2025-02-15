package java_ProgramsBySDETQA_PAWAN;

public class Even_Odd_FromArray {

	public static void main(String[] args) {
						
					int array[] = { 2,5,8,4,7,9,3};
					
					System.out.println("Even Numbers are .........");
					for(int i=0; i<array.length; i++) {
						
						if (array[i]%2 == 0) 
							System.out.println( array[i]);
						
					}
					
					//using enhanced for loop
					System.out.println("Using Enhance for loop even numbers are");
					for(int value : array) {
						
						if(value%2==0)
							System.out.println(value);
					}
					
					
					System.out.println("Odd numbers are .............");
					
					for (int i = 0; i<array.length; i++) {
						
						if (array[i]%2!=0) {
							
							System.out.println(array[i]);
						}
					}
					
				System.out.println("Using Enhanced for loop odd numbers are");
				
					for(int num : array){
						if(num%2!=0)
							System.out.println(num);
					}
					
			

	}

}

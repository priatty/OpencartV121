package java_ProgramByPankaj;

public class Print_OddAndEven_SeperatlyFromArray {

	public static void main(String[] args) {
	
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("All even numbers are: ");
		for(int e: arr) {
			
			if(e%2==0) {
				
				System.out.println(e);
			}
		}
		
		System.out.println();
		System.out.println("All odd numbers are : ");
		
		for(int e : arr) {
			
			if(e%2!=0) {
				
				System.out.println(e);
				
				
			}
		}

	}

}

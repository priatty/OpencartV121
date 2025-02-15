package java_ProgramsBySDETQA_PAWAN;

public class MaxAndMin_InArray {

	public static void main(String[] args) {
		
		int array[] = { 50,40,80,56,47};
		int max = array[0] ;
		int min = array[0];
		
		//MAX FROM ARRAY
		for(int i =1 ; i<array.length; i++) {
			
			if(array[i] >max){
				
				max = array[i];
				
			}
			
			System.out.println(max);
		}
		
		// MINIMUN FROM ARRAY
		for (int i = 1; i< array.length ; i++) {
			if(array[i]<min) {
				
				min = array[i];
			}
			
			System.out.println(min);
		}

	}

}

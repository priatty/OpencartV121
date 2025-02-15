package java_ProgramsBySDETQA_PAWAN;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int array[] = { 1,2,3,4,5};
		int sum = 0;
				for(int i = 0; i<array.length ;i++) {
					
					sum = sum+array[i];
				}
				
				System.out.println(sum);
				
			//Using Enhance for loop
				
				int sum2 =0;
				for(int value : array) {
					
					sum2 = sum2 + value;
				}
				
				System.out.println(sum);

	}

}

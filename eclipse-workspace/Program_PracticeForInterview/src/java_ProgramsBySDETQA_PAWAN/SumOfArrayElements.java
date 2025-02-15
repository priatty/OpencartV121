package java_ProgramsBySDETQA_PAWAN;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int array[] = {10,20,30,40,50};
		int len = array.length;
		int sum = 0;
		int i;
		for( i =0 ; i<len ; i++ )
		{
			
			sum = sum+array[i];
	
		}
		System.out.println("Addition = " + sum);
		
		

	}

}

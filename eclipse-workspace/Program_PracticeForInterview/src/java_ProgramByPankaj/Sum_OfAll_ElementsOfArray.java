package java_ProgramByPankaj;

public class Sum_OfAll_ElementsOfArray {

	public static void main(String[] args) {
		
		
		int arr[] = { 1,2,3,4,5};
		int sum =0;
		for(int i =0 ; i <arr.length ;i++) {
			
			sum = sum +arr[i];
		}

		System.out.println(sum);
	}
	
	/* using for each loop
	 
	 int sum=0;
	for(int e:arr)
	{
		sum=sum+e;
	}

	 */

}

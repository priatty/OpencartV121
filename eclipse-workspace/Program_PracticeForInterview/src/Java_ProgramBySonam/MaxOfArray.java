package Java_ProgramBySonam;

public class MaxOfArray {

	public static void main(String[] args) {
		
		int array[] = {4,5,6,15,7,8,9,17};

		for (int i=0 , max =array[0] ,position=0; i<array.length ; i++)  //first no. at index 0 i.e array[0] is initialize as max 
		{
			
			if (array[i] >max) {
				max = array[i];
				position=i;
			}
			
			System.out.println("The maximum number is : " +max);
			 System.out.println("Position is " + (position+1));  //numbering stars from 0 so add 1 here
		}
	}	
}

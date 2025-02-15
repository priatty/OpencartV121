package java_ProgramsBySDETQA_PAWAN;

import java.util.HashSet;

public class DuplicatesFromArray {

	public static void main(String[] args) {
		
		int array[] = {20,50,60,30,80,50,80};
		//int array[] = {20,60,30,80,50};   use to check no duplicates
		
		boolean flag  = false;
		for(int i= 0; i<array.length;i++) {
			for(int j=i+1 ; j<array.length; j++) {
				
				if(array[i]==array[j]) {
					
					System.out.println("Duplicate element is  =" +array[i]);
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			
			System.out.println("Duplicate Value not found");
		}
		

	
	
	
	//Using Hash set  (Not Accept duplicates)
	HashSet<Integer > elements = new HashSet<Integer>();
	
    for( int ele : array)
    {
    	if(elements.add(ele)==false) {
    		
    		System.out.println("Duplicate found = " + ele);
    		flag = true;
    	}
    	
    	
    }
    
    if(flag== false) {
    	
    	System.out.println("Duplicate not found ");
    }
    	
    	
	

}
}

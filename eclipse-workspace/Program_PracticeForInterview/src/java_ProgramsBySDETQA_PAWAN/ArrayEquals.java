package java_ProgramsBySDETQA_PAWAN;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		   
		 int a1[] =  {1,2,3,4,6};
		 int a2[] =  {1,2,3,4,5,};
		 
		 
		 // Approach  1
		 boolean result=  Arrays.equals(a1, a2);
		//System.out.println("Both Arrays are equal -" + result);
		 
		 if (result == true) {
			 
			 System.out.println("Both the arrays are equal");
		 }else 
			 
			 System.out.println("Both the Arrays are Not Equal");
		 
	
	  //Approach 2
	
	    boolean status = true;
	    
	    if (a1.length == a2.length) {
	    	
	    	for (int i = 0 ; i<a1.length; i++) {
	    		
	    		if (a1[i] != a2[i] ) {
	    			
	    			status= false;
	    		}	
	   
	    	}
	    }
	    	else
	    	{
	    		status =false;
	    	}
	    		
	    		if(status == true) {
	    			
	    			System.out.println("Arrays are equal");
	    			
	    			
	    		}
	    		else {
	    			
	    			System.out.println("Arrays are not equal");
	    		}
	    	}
	    	
	    }

	



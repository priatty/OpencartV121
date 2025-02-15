package java_ProgramsBySDETQA_PAWAN;

public class ReverseAString_ThreeWays {

	public static void main(String[] args) {
		
		
		String str = "Priyanka";
		String rev=" ";
		System.out.println("Original String -" +str);
		/* Using CharAt Method
		int len = str.length();
		
		for (int i = len-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}*/
		
		//Using charactor  Array
		
		/*char a[] = str.toCharArray();
		int len = a.length;
		for(int i= len-1 ; i>=0 ; i--) {
			
			rev = rev+ a[i];
			
		}*/
		
		//System.out.println("Reversed String - "  +rev);
		
		
		//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(str);
	    System.out.println("Reversed String -   "+sb.reverse());
		
		

	}

}

package java_ProgramsBySDETQA_PAWAN;

public class SearchElementInAnArray {

	public static void main(String[] args) {
	
		
		int a[] = {30,40,80,10,20};
		
		int search_ele = 50;
		boolean flag = false;
		for(int i = 0 ; i<a.length; i++) {
			
			if(search_ele == a[i] ) {
				
				System.out.println("Element Found at " + i);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			
			System.out.println("element not found");
		}

	}

}

package different_Patterns2;
//      *
//     **
//    ***
//   ****
//  *****
//   ****
//    ***
//     **
//      *
public class Pattern6 {

	public static void main(String[] args) {
		
		
	for(int i = 1 ; i<=5 ; i++) {
			for(int j = 4 ; j>=i ; j--) {
				
				System.out.print(" ");
			}
			
			for(int k= 1 ; k<=i ; k++) {
				
				System.out.print("*");
			}
			
       	System.out.println();
	}
       	for(int x = 1 ; x<=4 ; x++) {
       		    
       		for (int a= 1; a<=x ;a++) {
       			
       			System.out.print(" ");
       		}
       		for(int b= 4; b>=x; b--) {
       			
       			System.out.print("*");
       		}
       		
       		System.out.println();
       		
		}
	}

}

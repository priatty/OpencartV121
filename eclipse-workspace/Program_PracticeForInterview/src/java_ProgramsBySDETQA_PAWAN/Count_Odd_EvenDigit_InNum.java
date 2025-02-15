package java_ProgramsBySDETQA_PAWAN;

public class Count_Odd_EvenDigit_InNum {

	public static void main(String[] args) {
		
		int n = 412454876;
		int reminder;
		int count1 = 0, count2  =0;

		while(n>0) {
			
			reminder = n%10;     // 6
			
			if(reminder%2==0) {   //6/2 =0
				
				count1++;     //1
			}else {
				
				count2++;   
			}
			
			n=n/10;   //41245487
		}
		System.out.println("Even =" +count1 +" Add = " + count2);
	}

}

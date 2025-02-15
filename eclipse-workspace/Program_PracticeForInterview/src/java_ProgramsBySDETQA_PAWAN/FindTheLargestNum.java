package java_ProgramsBySDETQA_PAWAN;

import javax.sound.midi.SysexMessage;

public class FindTheLargestNum {

	public static void main(String[] args) {
		  
		int a = 10,b=2555,c=30;
		// logic 1
	//	if (a>b&&a>c) {
			
		//	System.out.println("Largest = " +a);
	///	}else if(b>a && b>c) {
		//	System.out.println("Largest = " +b);
	//	}else {
		//	System.out.println("Largest = " +c);
	//}
	
	//logic 2
	int max = a;
	if(b>max)
		max=b;
	if(c>max)
		max=c;
	System.out.println(max);
	
  }
}

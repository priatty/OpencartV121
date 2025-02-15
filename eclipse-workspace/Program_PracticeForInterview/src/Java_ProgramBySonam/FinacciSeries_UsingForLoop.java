package Java_ProgramBySonam;

public class FinacciSeries_UsingForLoop {

	public static void main(String[] args) {
		
		int a = 0, b= 1,c;
		
		for(int i =0 ; i<=15; i++) {
				
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				
		}
		
	}
}



package java_ProgramsBySDETQA_PAWAN;

public class SwappingTwoNumbers5differentWay {

	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		
		System.out.println("Before Swapping..." +a+  "     " + b );
		//Logic 1 - using third Var temp
		/*int temp;
		temp = a;
		a=b;
		b= temp;
		*/
		
		//Logic 2 Without using third var (using + and - operator)
		
		/*a= a+b;  //a=30
		b=a-b;    //b=10
		a=a-b;     //a=20
		*/
		
		//Logic 3 Without using third var (Using * and /)
		//here a and b not equls to 0
		
		/*a = a*b;
		b=a/b;
		a=a/b;
		*/
		
		//Logic 4 without using third var (using XOR operator)
		
		/*a=a^b;
		b=a^b;
		a=a^b;
		*/
		
		//Logic 5
		//Single Statement
		
		b= a+b-(a=b);
		
		System.out.println("After Swapping..." +a+  "     " + b );

	}

}

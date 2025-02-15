package java_ProgramByPankaj;

import java.util.Scanner;

public class FindAreaOfCircle {
	
	/*We have to input the radius to the Program.
	- Radius is the center of the circle to the border of the circle.  
	Area of the circle is Pi * radius * radius.*/

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);	
			System.out.println("Enter the value of radius");
			double radius =sc.nextDouble();
			System.out.println(Math.PI);   // using math class  value of pi  is 3.141592653589793(pi is static method)
			System.out.println("Area of a circle having radious" +radius+" is  = " + (Math.PI*radius*radius) );
			
		
		
		
		}
	}




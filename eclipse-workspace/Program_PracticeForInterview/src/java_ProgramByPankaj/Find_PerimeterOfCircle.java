package java_ProgramByPankaj;
/*Java Program to find the perimeter of the circle

We have to input the radius to the Program.
- Radius is the center of the circle to the border of the circle.  
Perimeter of the circle is 2 * Pi * r*/

import java.util.Scanner;

public class Find_PerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		double r = sc.nextDouble();
		
		System.out.println("Perimeter of the circle having radiou" + r + "is = " + (2*Math.PI*r));
	}

}

package java_ProgramByPankaj;

import java.util.Scanner;

/*
Java program to find whether the given number is an Armstrong number

If you cube every digit of the number and add them.
If this sum is equal to the actual number, then we can call the number as Armstrong number.

Armstrong Number
153
1*1*1+5*5*5+3*3*3
1+125+27 
153

both number same hence armstrong

we can use below logic also
while(num>0)
       {
       	remainder=num%10;
       	num=num/10;
       	cubeNum=cubeNum+(remainder*remainder*remainder);
       	
       }
*/

public class ANumberIsArmstrongOrNot {
	
public static void main(String[] args) {
		
	    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any Number : "); //153
        int num=scanner.nextInt();
        scanner.close();
        
        int originalNum=num;
        int cubeNum=0;
        int remainder;
        
        while(num>0)
        {
        	remainder=num%10;
        	num=num/10;
        	cubeNum=cubeNum+(remainder*remainder*remainder);
        	
        }
        if(originalNum==cubeNum)
        {
        	System.out.println(originalNum+" is a Armstrong Number");
        }
        else
        {
        	System.out.println(originalNum+" is not a Armstrong Number");
        }
}}



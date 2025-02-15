package java_ProgramsBySDETQA_PAWAN;

import java.util.Scanner;

public class ReverseNum_DifferentWays {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Number  - ");
           int num = sc.nextInt();   //ex . 1234
           
           // 1. Using Algorithm
           /*int rev = 0;
           while(num!=0) {
        	   
        	   rev = rev*10 + num%10;    //0+1234%10=4       40+123%10 = 43     430+12%10 = 432  4320+1%10 =4321
        	   num=num/10;					//1234/10=123     123/10=12   12/10=1  1/10=0	
        	   
           }*/
           
           
           // 2.using String Buffer class
           
           /*StringBuffer sb = new StringBuffer(String.valueOf(num));   //convert num to string using String.valueOf(num)
           StringBuffer rev = sb.reverse();
           System.out.println("Reversed number  is  " +rev);*/
           
           
           //3.Using StringBuilder Class
           
           StringBuilder sbl = new StringBuilder();
           sbl.append(num);
           StringBuilder rev = sbl.reverse();
           System.out.println("Reversed number  is  " +rev);
           
	}
}

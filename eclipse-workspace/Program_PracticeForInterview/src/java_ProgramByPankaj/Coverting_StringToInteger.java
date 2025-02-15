package java_ProgramByPankaj;

public class Coverting_StringToInteger {
	/*
	 Java program to convert a String to integer
	 */
	public static void main(String[] args) {
		
		/*
		String str="Arun";
		int num=Integer.parseInt(str);
	    System.out.println(num);
	    
	    We can not convert this type of string in int . if try then java.lang.NumberFormatException
	    */

		System.out.println("-----------Method 1-------------");
		
	    String str="9";    //we can convert this bcoz in string we can save number
	    int num=Integer.parseInt(str);
	    System.out.println(num);

	    
	    String str1="9";   
	    System.out.println(str1+1);            //91 bcoz here 9 is string not a number
	    int num1=Integer.parseInt(str);        
	    System.out.println(num1+1);
	    
	    System.out.println("----------Method 2-------");
	    
	    String str3="9";
	    int num3=Integer.valueOf(str3);
	    System.out.println(num3);
	}
	}



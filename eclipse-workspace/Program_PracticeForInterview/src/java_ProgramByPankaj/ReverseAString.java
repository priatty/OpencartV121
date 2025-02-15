package java_ProgramByPankaj;

public class ReverseAString {

	/*
	 Java program to reverse a String
	 */
		public static void main(String[] args) {
			String str = "Arun Motoori";

	        String reversedStr="";  

	       char[] ca = str.toCharArray(); //toCharArray is used when String want to converted into Character in array format

	       for(int i=ca.length-1;i>=0;i--) {
	      
	       reversedStr = reversedStr+ca[i];
	      
	       }

	      System.out.println(reversedStr);

		
		
		
		
		}

	}


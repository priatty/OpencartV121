package Java_ProgramBySonam;

public class SwappingString {

	public static void main(String[] args) {
		
		String str1 = "Priyanka";
		String str2 = "Atul";
		String tempString = "" ;
		
		System.out.println("Before Swapping :" +"Str1 is " +str1 +"   Str2 is " +str2);
		
		tempString=str1;
		str1=str2;
		str2=tempString;
		
		System.out.println("Before Swapping :" +"Str1 is " +str1 +"  Str2 is " +str2);
		

	}

}

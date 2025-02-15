package Java_ProgramBySonam;

public class StringWordCount {

	public static void main(String[] args) {
		
		String str = "Hello world, how are you";
		//split(\\s) uses a regular expression(\\s+) method to split the string whereever there is one or more while spaces characters (spaces,tabs,newlines,etc)
		String[] words = str.split("\\s"); // Split method returns an array of string 
				
		int wordcount = words.length;
		System.out.println("Total World Count is : " + wordcount);
		

	}

}

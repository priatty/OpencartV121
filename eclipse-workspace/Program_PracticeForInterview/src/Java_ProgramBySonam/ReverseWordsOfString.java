package Java_ProgramBySonam;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		
		String str = "Bharat kumar jain";
	   String[] words =str.split("\\s");
	   
	   //reversing the array of words
	   String reversedStr = "";
	   
	   for(int i=words.length-1; i>=0 ; i--) {
		   
		     reversedStr = reversedStr + words[i] +" ";
		   }
	   

	   //Trimming the trailing spaces and displaying the reversed string
	 // reversedStr =  reversedStr.trim();
	   
	   System.out.println("Original String is : " + str);
	   System.out.println("Reversed words : " +reversedStr);
	}

}

package java_ProgramByPankaj;

public class ReverseString_Revise {

	public static void main(String[] args) {

		String str = "Priyanka Patinge";
		String reversedStr = "";
		
		char [] ch = str.toCharArray();
		
		for(int i = ch.length-1 ; i>=0; i--) {
			
			reversedStr = reversedStr + ch[i];
		}
		
		System.out.println(reversedStr);


	}

}

package Java_ProgramBySonam;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String x = "Greeks For Geekshg";
		int  len = 0;
		for(int i = 0; i< x.length(); i++) {

			if(x.charAt(i) == ' ')
				len= 0;
			else
				len++;
		}
        System.out.println("The length of last  word is : " +len);
	}

}

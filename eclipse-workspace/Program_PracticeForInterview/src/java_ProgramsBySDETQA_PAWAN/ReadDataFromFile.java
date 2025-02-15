package java_ProgramsBySDETQA_PAWAN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		    
		     FileReader fr = new FileReader("C:\\Users\\priya\\OneDrive\\Documents\\Background&HooksDifference.txt");
		     
		     BufferedReader br = new BufferedReader(fr);
		     
		     String str;
		     
		     while((str=br.readLine())!=null) {
		    	 
		    	 System.out.println(str);
		    	 
		     }
		     
		     br.close();

	//2.Approach using scanner class
		     
		     FileReader file = new FileReader("C:\\\\Users\\\\priya\\\\OneDrive\\\\Documents\\\\Background&HooksDifference.txt");
		 	
			 Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				
				System.out.println(sc.nextLine());
			}
				 

		     
	
	//3.Approach without using loop (using delimiter method)
	FileReader file1 = new FileReader("C:\\Users\\priya\\OneDrive\\Documents\\ackground&HooksDifference.txt");
	
	 Scanner sc1 = new Scanner(file1);
	 sc1.useDelimiter("\\z");
	 System.out.println(sc1.next());
		 
			

}
}
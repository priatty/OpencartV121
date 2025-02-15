package Java_ProgramBySonam;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("Atul");
	arr.add("Samar");
	arr.add("Rsjesh");
	arr.add("Ravi");
	arr.add(null);
	 
	if(!arr.contains("Priya")) {
		arr.add("Priya");
	
	}

		
	System.out.println(arr);

	}

}

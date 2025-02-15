package Java_ProgramBySonam;

public class RemoveDuplicateFromAnArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,6,3,1,8};
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}

package arrays;

public class smallnum_array {

	public static void main(String[] args) {
		int []arr= {10,9,8,7,0,6,7,8,9};
		 int   small=arr[0];
		   for(int i=0;i<arr.length;i++) {
			   if(small>arr[i]) {
				   small=arr[i];
			   }
		   }
         System.out.println("small num in array:"+ small);
	}

}

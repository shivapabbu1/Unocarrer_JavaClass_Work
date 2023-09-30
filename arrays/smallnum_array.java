package arrays;

public class smallnum_array {
	
	public static void firstSmall(int[]arr) {
		
		   int small=arr[0];
		
		   for(int i=0;i<arr.length;i++) {
			   if(small>arr[i]) {
				   small=arr[i];
		          }
		       }
        System.out.println("small num in array:"+ small);
       }
	public static void secondSmall(int[]arr) {
		
		 int   secondsmall=arr[0];
		 int temp;
		   for(int i=0;i<arr.length;i++) {
			   for (int j=i+1;j<arr.length;j++) {
				   if(arr[i] > arr[j] ) {// 10 > -23
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}

			   }
			      
		       }
        System.out.println("second small num in array:"+ secondsmall);
       }
	

	public static void main(String[] args) {
		int []arr= {10,9,8,7,0,6,7,8,9};
		firstSmall(arr);
		secondSmall(arr);
		

}
}
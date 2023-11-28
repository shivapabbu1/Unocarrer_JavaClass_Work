
public class RotateArray_K_Elements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int pos=3;
		 int []narr=new int[arr.length];
		 int index=0;
		 for (int i = arr.length - pos; i < arr.length; i++) {
		        narr[index++] = arr[i];
		 }
		    for (int i = 0; i < arr.length - pos; i++) {
		        narr[index++] = arr[i];
		       }
		 
		 for( int v:narr) {
			 System.out.println(v);
		 }
			 
	
	}


}

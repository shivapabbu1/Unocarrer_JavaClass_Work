package arrays;



public class assignment_Arrays {

	public static void main(String[] args) {
		
	// common eleents in both array 	
		 int a[]= {1,12,5,7,8,9,11,20,10};
		
		int b[]= {1,5,7,3,18,15,2,10};
		int c[]=new int[a.length];
		int index=0;
		 for(int i=0;i<a.length;i++) {
			   for(int j=0;j<b.length;j++) {
				   if(a[i]==b[j]) {
					 c[index]=a[i]; 
					 index++;
				   }
			   }
			 
		 }
		 for(int i=0;i<index;i++) {
			  System.out.print(c[i] +" "); 
		 }
       

		
	      
		 
		
		 
		 
		 
	}

}

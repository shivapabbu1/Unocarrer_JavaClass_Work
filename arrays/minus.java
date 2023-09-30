package arrays;

public class minus {
	
	static int[] A={1,20,2,3,4,};
	static int[] B={1,2,3,300,400};
	static int index=0;
	static int[] AuB=new int[A.length+B.length];
	
	
	static void copy(int[] AuB,int[] source){
		for(int i=0;i<source.length;i++) {
			AuB[index]= source[i];
			index++;
		}
	}
	static void copyAnother(int[] AuB,int[] source){
		boolean isFound= false;
		for(int i=0;i<source.length;i++) {
			for(int k=0;k<index;k++) {
				
				if(source[i] == AuB[k]) {
					isFound = true;
					continue;
				}// if
			}// k
			if(isFound == false) {
				AuB[index]= source[i];
				index++;
			}
			else {
				isFound = false;
			}
		} 
	}
	 
	     public static void main(String[] args) {
	    	 
		  if(A.length>B.length) {
			  copy(A,B);
			  copyAnother(A, B);
			  for(int i=0;i<A.length;i++) {
				  System.out.print(AuB[i]+" ");
			  }
			  
		  }else {
			  copy(B,A);
			  copyAnother(B, A);
			  for(int i=0;i<B.length;i++) {
				  System.out.print(AuB[i]+" ");
			  }
		  }

	}

}

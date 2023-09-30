package arrays;

public class union {

	static int[] A={1,20,2,3,4,5,6,7,8,9};
	static int[] B={1,2,3,300,400,500,600,700,800,900};
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
					break;
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
		
		if(A.length > B.length) {
			copy(AuB,A);
			copyAnother(AuB,B);
		}
		else {
			copy(AuB,B);
			copyAnother(AuB,A);
		}
		
		System.out.println("A elements");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n B elements");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
		System.out.println("\n AuB Elements.....");
		for(int i=0;i<index;i++) {
			System.out.print(AuB[i]+" ");
		}
	}

}

package arrays;

public class secondSmall {

	public static void main(String[] args) {
		
			int[] num = {100,200,10,23,459,5,8,21,1,0};
		
		
		int t;
	
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] > num[j] ) {// 10 > -23
					t = num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
		}
		System.out.println("\nAfter Sorting......");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n second small:"+ num[1]);
		
		System.out.println("\n second large:"+ num[num.length-1]);


	}

}

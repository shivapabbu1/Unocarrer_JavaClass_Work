package arrays;

import java.util.function.IntBinaryOperator;

public class arrays {
	
	

	public static void main(String[] args) {

	/*	int[] num = {1,2,3,4,5,6,7,8,9,10};// 10/2----5
		int evenSum=0,oddSum=0;
		
		for(int i=(num.length-3);i!=-1;i--) { // up to  number 8
			
			if(num[i] % 2 == 0) evenSum = evenSum + num[i];
			else oddSum =oddSum + num[i];
		}
		
		System.out.println("even sum--->"+evenSum);
		System.out.println("odd sum--->"+oddSum);*/
		
		//------- SWAP LAST INTO FIRST AND REMAIN SAME:
		
	/*	int[] num= {50,600,30,40,50,60,70,80,90,100};
		System.out.println("before");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int last=num[num.length-1];
		int t,prev=num[0];
		
		for(int i=1;i<num.length;i++) {
			t=num[i];
			num[i]=prev;
			prev=t;
		}
		num[0]=last;
		System.out.println(" \n after");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		} */
		
		
		//------SIMPLE LOGIC-----
         /*   int a[] = {40,100,40,50, 20, 30, 40, 50, 60, 70, 80, 90, 100};
			int t = a[a.length-1];
			if (a[0]==a[0]);
			System.out.println(t);
			
		    for(int i = 1; i<a.length;i++) {
		         System.out.println(a[i-1]);   		
             } */
		
		   //SWAP LAST NUMBER INTO FIRST REAMIN SAME: 
     /*    int a[]= {1,2,3,4,5,6,7,8,9,10};
		     //2,3,4,5,6,7,8,9,10,1
		
		for(int i=1;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		int temp=a[0];
		if(a[a.length-1]==a[a.length-1]) {
			System.out.println(temp);
		}
	*/
	//_________________________________________________	
	//______Commn elem in two arrays 
// while based on length of arrays:		
	/*	int[] a={1,2,3,600,700,900,1000};
		int[] b={10,20,2,3,1,100,200,300,800,2000,3000,4000,5005,606,709};
		// 1 2 3
		int[] aAndb = new int[a.length];
		int resIndex=0;
		if ( (a.length > b.length)){
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<a.length;j++) {
					if(b[i] == a[j]) {
						aAndb[resIndex]=b[i];
						resIndex++;
					}
				}
			}
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					if(a[i] == b[j]) {
						aAndb[resIndex]=a[i];
						resIndex++;
}
				}
			}
		}
		
		for(int i=0;i<resIndex;i++) {
			System.out.print(aAndb[i]+" ");
			
		}
	*/	
//__________________ use method and simple logic
		
	/* int a[]= {1,2,3,4,5,6,7,8,910};
	 int b[]= {10,2,30,4,50,6,70,8,90};
	 
		 if(a.length>b.length) {
			 findAandB(b, a);
		 } else {
			 findAandB(a, b);
		 }
 */
		
	
	
			float rupees = ruppesTodollar("US",100);
			System.out.println(" US dollar value :"+rupees);
			
			rupees = ruppesTodollar("SAD",100);
			System.out.println("Saudi Dirams value:"+rupees);
			
			
			String capital = countryCapital("AP");
			System.out.println("AP Capital---->"+capital);
			
			
			capital = countryCapital("India");
			System.out.println("India Capital---->"+capital);
			
			
		
    }

      static float ruppesTodollar(String country,int currency){
	   float res =0;
	   if(country=="US") {
		res = 88.57f * currency;
	   }
	   if(country=="SAD") {
		res = 57.45f * currency;
	     }
	     return res;
       }

    static String countryCapital(String country){
	String res = "";
	if(country=="AP") {
		res = "VIZAG";
	}
	if(country=="India") {
		res = "Delhi";
	}
	return res;
    } 
	
/*	static void findAandB(int[] lower,int[] upper) {
		int[] c = new int[lower.length];
		int resIndex = 0;
		for(int i=0;i<lower.length;i++) {
			for(int j=0;j<upper.length;j++) {
				if(lower[i] == upper[j]) {
					c[resIndex]=lower[i];
					resIndex++;
				}// if
			}// j
		}// i
		
		for(int i=0;i<resIndex;i++) {
			System.out.print(c[i]+" ");
			
		
	}
	*/
    
    
    int []one= {1,2,3,4,5,6,7,8,9,10,11,13,17};
	   //even and odd numbers
	 int k=0,j=0;
	 int[]odd=new int[k];
	 int[]even=new int[j];
	
	
	
}

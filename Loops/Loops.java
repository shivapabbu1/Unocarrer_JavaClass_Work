package Loops;

public class Loops {

	public static void main(String[] args) {
		//For Loop :In this loop intalization and iteration value is not mandatory
		/*int i=1;
		for(;i<=5;) {
           System.out.println("numbers"+i);
           i++;
	} 
	// Excute sum of evn and odd in various logics ....
	 *  using boolean value
		
	/*	int even=0,odd=0;
		boolean flag=true;
	for(int i=1;i<=10;i+=1) {
		if(flag==true){
        odd+=i;
        flag=false;
		}
		else {
			even+=i;
			flag=true;
		}
		
	}
		System.out.println("even is "+even);
		System.out.println("odd is "+odd);
*/
		//without modulo operator...
	/*	int evenSum=0,oddSum=0;
		for(int i=1,j=2; i<=10 || j<=10;) {
			 evenSum+=j;
			 oddSum+=i;
			 i=i+2;
			 j=j+2;
		}
		  
		System.out.println("evensum is "+evenSum);
		System.out.println("oddsum is "+oddSum);*
		*/
		//with Modulotor
		
	/*	 int evenSum=0,oddSum=0;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			evenSum+=i;	
			}
		    else{
			oddSum+=i;
		    }
		}
		System.out.println("evensum:"+evenSum +"oddsum:"+oddSum);
	*/
//-----------print add  all integers  upto 20 in 3 methods
		
    /*	 	int n=20,sum=0;
		  for(int i=1;i<=n;i++) {
			sum+=i;
		   }
		System.out.println("sum in for loop"+sum);
	*/
		
	/* int i=1,n=10,sum=0;
		while(i<=n) {
			sum+=i;
			i++;
			}
		System.out.println( "sum in while loop:" +sum);
	*/
		/*	int i=1,n=10,sum=0;
		do {
			sum+=i;
			i++;
			}	while(i<=n);
		System.out.println( "sum in dowhile loop:" +sum);
			*/
//		int even=0,odd=0;
//		for(int x=2,y=1;x<=10&&y<=10;) {
//			 even=x;
//			 x=x+2;
//			 System.out.println( "even is"+even);
//			 odd=y;
//			 y=y+2;
//			 System.out.println( "0dd is"+odd);
//			
	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
				 
			}
			
			/*int j=1;
			while(j<=10) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}*/
		}
		
		
		
		
		
  }
}

 



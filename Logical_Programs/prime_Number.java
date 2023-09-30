package Logical_Programs;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //FIRST LOGIC:___________________  
	//    int num=13,count=0,r;
//	    for(int i=1;i<=num;i++) {
//	    	r=num%i;
//	    	if(r==0) {
//	    		count+=1;
//	    	}
//	    }
//	    if(count==2) {
//	    	System.out.println("it is prime");
//	    }else {
//	    	System.out.println("it is  not a prime");
//	    }
	    
//    secong logic:_________________________________
//	     int n=16;
//	     boolean isPrime=true;
//	     for(int i=1;i<=n;i++) {
//	    	  if(num%i==0) {
//	    		  isPrime=false;
//	    	  }
//	     }
//	    	  if(isPrime==true) {
//	  	    	System.out.println("it is prime");
//	  	    }else {
//	  	    	System.out.println("it is  not a prime");
//__________________________________________
	  	 // 3rd logic   	
	  	    	int num=16;
	  	    	
	  		     boolean isPrime=true;
	  		     for(int i=2;i<=(num-1)/2;i++) {
	  		    	  if(num%i==0) {
	  		    		  isPrime=false;
	  		    		  break;
	  		    	  }
	  		     }
	  		    	  if(isPrime==true) {
	  		  	    	System.out.println("it is prime");
	  		  	    }else {
	  		  	    	System.out.println("it is  not a prime");
	     }
	     
		
	

 }
}

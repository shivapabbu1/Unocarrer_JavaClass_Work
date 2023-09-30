package Loops;

public class LoopsAssign {

	public static void main(String[] args) {
		//1*2+2*3+3*4+4*5+5*6+6*7+7*8+8*9+9*10 --->2+6+12+20
		
		int sum=0;
		for(int i=1;i<10;i++) {
			sum+=i*(i+1);
		 }
		 System.out.println("sum is "+sum);

	}
}

package lists_Array;
import java.util.*;
public class evenAndOdd {

	public static void main(String[] args) {
	ArrayList<Integer> numList=new ArrayList<>();
	 
	numList.add(1);
	numList.add(2);
	numList.add(4);
	numList.add(3);
	numList.add(6);
	numList.add(5);
	numList.add(8);
	numList.add(7);
	numList.add(9);
	numList.add(10);
	
	//find even sum and odd sum
	System.out.println(numList);
	int EvenSum=0;
	int OddSum=0;
	for(int i=0;i<=numList.size();i++) {
		    if(i%2==0) {
		    	EvenSum+=i;
		    }else {
		    	OddSum+=i;
		    }
	}
	System.out.println("Even sum is :" + EvenSum);
	System.out.println("Odd sum is :" + OddSum);

	}

}

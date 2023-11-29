package classProblems;

import java.util.Scanner;

public class NumberToWords_Hundred {

	public static void main(String[] args) {
		String []singleDigit= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []doubleDigit= {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};	
		String []tenDigit={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};

		String inWords="";
		Scanner sc=new Scanner(System.in);
		
		int input=sc.nextInt();
		if( input>=0 && input<10) {
		inWords=singleDigit[input];
	}
	else if( input>10 && input<20) {
		inWords=doubleDigit[input%10];
	}
	else if(input>20 && input<100) {
		inWords=tenDigit[input/10];
		inWords+=singleDigit[input%10];
	}
	else if(input>=100 && input<1) {
		inWords=singleDigit[input/100]+"hundred";
		inWords+=singleDigit[input%100];
	}
	else if(input>=110 && input<100) {
		inWords=singleDigit[input/100]+"hundred";
		inWords+=doubleDigit[input%100];
	}

	
	System.out.println(inWords);
	

	}

}

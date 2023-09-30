
public class GoldProblem {

	public static void main(String[] args) {
		
		int goldRate=58900,goldInGrams=10;
	     double cashInHand=254000;
	     
	     int oneGramRate=(goldRate/goldInGrams);
	     System.out.println("amount for each gram :" +oneGramRate);
	     
	     double noOfGramsForCash= (cashInHand/oneGramRate);
	     System.out.println("No.of GramsofGold for cashInHand :"+noOfGramsForCash);
	     int accurateValue=(int)noOfGramsForCash;
	     System.out.println("No.of GramsofGold for cashInHand accurate value in grams:" +accurateValue);
	    

	}

}

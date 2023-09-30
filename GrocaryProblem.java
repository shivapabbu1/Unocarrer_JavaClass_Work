
public class GrocaryProblem {

	public static void main(String[] args) {
		
			int amount=1780,onion=250,tomato=80,onionInKilos =3,tomatoInKilos=5;
 		int costForBoth=((onion*onionInKilos)+(tomato*tomatoInKilos));
 		System.out.println("cost for both is:"+costForBoth);
 		int change=amount-costForBoth;
 		System.out.println("reamin change="+ change);
 		int additionalTomato=change/tomato;
 		int additionalOnion=change/onion;
 		 System.out.println("No.of tomatoinkilos:"+ tomatoInKilos+additionalTomato);
 	     System.out.println( "No.of onionin kilos:"+onionInKilos);
 	     System.out.println("additional tomato"+additionalTomato);
 	     
 		

	}

}

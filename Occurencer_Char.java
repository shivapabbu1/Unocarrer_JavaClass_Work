package strings.demo;

public class Occurencer_Char {

	public static void main(String[] args) {
	String message="Welcome to java Good Morning SuperStar";
	int Ecount=0;
	int Ocount=0;
     char ch;
	for(int i=0;i<message.length();i++) {
		   ch=message.charAt(i);
		if(ch=='e') Ecount+=1;
		if(ch=='o') Ocount+=1;
	  }
	System.out.println("Ocuurance of E is "+Ecount);
	System.out.println("Ocuurance of 0 is "+Ocount);

	}

}

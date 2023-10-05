package strings.demo;

public class Characters {

	public static void main(String[] args) {
		String str="Welcome To Hyderabad";
		char ch;
		String res="";
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			// 65--- 90----A-Z
			if(ch >=65 && ch <=90) {
				res = res +(char) (ch +32);
			}
			else if(ch >=97 && ch <=122) {// a-z
				res = res +(char) (ch - 32);
			}
			else {
				res = res + ch;
			}
		}// for
		 System.out.println(res+" ");
		
		
//______better method___________________
		 String result="";
		for(int j=0;j<str.length();j++) {
		   ch=str.charAt(j);
		   if(Character.isLowerCase(ch)){
			   result+=Character.toUpperCase(ch);
			} else {
			   result+=Character.toLowerCase(ch);
		 }//else
		}//for
	      System.out.println(result+" ");
	
	}

}

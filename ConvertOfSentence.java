package strings.demo;

public class ConvertOfSentence {

	public static void main(String[] args) {
		String msg="welcome To India.India Is Very Beautiful.hello";
		char ch;
		String res="";
		
		for(int i=0;i<msg.length();i++) {
			 ch=msg.charAt(i);
			 if(ch>=65 && ch<=90) {
				 res = res +(char) (ch +32);
			   }else {
				 res=res+ch;
			   }   //if
		    } //for
		
	  String[] s=res.split("\\."); 

	  //s array is a 2D array .ie. array of arrays s[j][k]
	      
	for(int j=0,k=0;j<s.length  ;j++) {
	    	    
	System.out.print(Character.toUpperCase(s[j].charAt(k))+s[j].substring(1)+". ");
	    	
	      }

	}

}

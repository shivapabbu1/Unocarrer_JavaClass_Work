package strings.demo;

public class StringPalindrome {

	public static void main(String[] args) {
	
         String name="madam";
         String revName="";
         for(int i=0;i<name.length();i++) {
        	 revName+=name.charAt(i);
         }
         if(name.equalsIgnoreCase(revName)) {
        	 System.out.println("yes it is palindrome");
         }else {
        	    System.out.println("yes it is not  palindrome");
         }
         
  //________method-2______________________
         boolean palindrome= true;
     
         for(int left=0,right=name.length()-1;left<name.length()/2;left++,right--) {
        	 if(name.charAt(left) !=name.charAt(right)) {
        		 palindrome=false;
        		 break;
        	 }//if
         }//for
         if(palindrome == true) {
        	 System.out.println("yes palindrome");
         }else {
        	 System.out.println("not a palindrome");
         }
	}

}
